package com.gradle.gradletemplate.login.service;

import com.gradle.gradletemplate.login.mapper.LoginMapper;
import com.gradle.gradletemplate.login.vo.UserVO;
import com.gradle.gradletemplate.util.CryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;


    public void insertUser(UserVO paramVO) {
        paramVO.setUserPw(CryptUtil.BCryptEnc(paramVO.getUserPw()));
        loginMapper.insertUser(paramVO);
    }

    public UserVO selectUser(UserVO userVO) {
        return loginMapper.selectUser(userVO);
    }
}
