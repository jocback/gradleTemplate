package com.gradle.gradletemplate.util;

import com.gradle.gradletemplate.login.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoginUtil {

    public static boolean isLogin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null || AnonymousAuthenticationToken.class.isAssignableFrom(authentication.getClass())) {
            return false;
        }
        return authentication.isAuthenticated();
    }

    public static UserVO getInfo() {
        if(isLogin()) {
            try {
                UserVO userInfo = (UserVO) SecurityContextHolder.getContext().getAuthentication().getDetails();
                return userInfo;
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                return null;
            }
        } else {
            return null;
        }
    }
}
