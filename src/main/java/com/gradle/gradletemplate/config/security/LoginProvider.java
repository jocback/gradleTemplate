package com.gradle.gradletemplate.config.security;

import com.gradle.gradletemplate.login.service.LoginService;
import com.gradle.gradletemplate.login.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class LoginProvider implements AuthenticationProvider {

    @Autowired
    private LoginService loginService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Object details = authentication.getDetails();

        String userId = authentication.getName();
        String userPw = (String) authentication.getCredentials();

        String resultUserPw = "";
        Object resultObj = null;

        UserVO param = new UserVO();
        param.setUserId(userId);
        param.setUserPw(userPw);

        UserVO userInfo = loginService.selectUser(param);

        // 사용자 존재여부
        if(userInfo==null) {
            throw new BadCredentialsException("아이디가 존재하지 않습니다.");
        } else {
            resultUserPw = userInfo.getUserPw();
            userInfo.setUserPw(null);
            resultObj = userInfo;
        }

        // 비밀번호 체크
        if(!userPw.equals(resultUserPw)){
            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
        }

        // 권한 리스트
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("MEMBER"));        // 별도 권한 관리는 만들지 않아 임의로 입력

        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userId, userPw, roles);
        authToken.setDetails(resultObj);

        return authToken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
