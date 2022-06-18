package com.gradle.gradletemplate.common.vo;

import lombok.Data;

@Data
public class ResponseDataVO {
    private String code;
    private String status;
    private String message;
    private Object item;
}
