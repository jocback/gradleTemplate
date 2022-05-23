package com.gradle.gradletemplate.login.vo;

import com.gradle.gradletemplate.common.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserVO extends PageVO {

    private String userId;
    private String userPw;
    private String userName;
    private String phone;
    private String email;
    private String createdTime;
    private String updateTime;

}
