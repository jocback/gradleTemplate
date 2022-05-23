package com.gradle.gradletemplate.login.mapper;

import com.gradle.gradletemplate.login.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    void insertUser(UserVO paramVO);
}
