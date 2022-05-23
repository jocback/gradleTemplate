package com.gradle.gradletemplate.login.service;

import com.gradle.gradletemplate.login.mapper.LoginMapper;
import com.gradle.gradletemplate.login.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public void insertUser(UserVO paramVO) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        paramVO.setUserPw(passwordEncoder.encode(paramVO.getUserPw()));
        loginMapper.insertUser(paramVO);
    }
}
