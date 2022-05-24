package com.gradle.gradletemplate.util;

import lombok.experimental.UtilityClass;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CryptUtil {

    public static String BCryptEnc(String str) {
        String encStr = "";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        encStr = passwordEncoder.encode(str);
        return encStr;
    }
}
