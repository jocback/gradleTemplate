package com.gradle.gradletemplate.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gradle.gradletemplate.common.constant.ResponseDataCode;
import com.gradle.gradletemplate.login.vo.UserVO;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        System.out.println("@@@@@@@@@@@@############# Success");
        ObjectMapper mapper = new ObjectMapper();

        UserVO userInfo = (UserVO) authentication.getPrincipal();

        ResponseDataDTO responseDataDTO = new ResponseDataDTO();
        responseDataDTO.setCode(ResponseDataCode.SUCCESS);
        responseDataDTO.setStatus(ResponseDataCode.SUCCESS);


        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().print(mapper.writeValueAsString(responseDataDTO));
        response.getWriter().flush();
    }
}
