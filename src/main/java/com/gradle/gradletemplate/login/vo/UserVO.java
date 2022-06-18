package com.gradle.gradletemplate.login.vo;

import com.gradle.gradletemplate.common.vo.PageVO;
import lombok.*;

@Data
public class UserVO extends PageVO {

    private String userId;
    private String userPw;
    private String userName;
    private String phone;
    private String email;
    private String role;
    private String createdTime;
    private String updateTime;

}
