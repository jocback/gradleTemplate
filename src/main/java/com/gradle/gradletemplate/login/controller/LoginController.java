package com.gradle.gradletemplate.login.controller;

import com.gradle.gradletemplate.login.service.LoginService;
import com.gradle.gradletemplate.login.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    // 로그인 페이지
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/loginForm");
        return mv;
    }
    // 로그인 페이지
    @RequestMapping(value = "/login/loginForm", method = {RequestMethod.GET})
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/loginForm");
        return mv;
    }

    @RequestMapping(value = "/login/selectUser", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelAndView selectUser(HttpServletRequest request, HttpServletResponse response, UserVO userVO) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsonView");
        mv.addObject("user", loginService.selectUser(userVO));
        return mv;
    }

    // 회원가입페이지
    @RequestMapping(value = "/login/register", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/register");
        return mv;
    }

    // 회원가입
    @RequestMapping(value = "/login/signUp", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelAndView signUp(UserVO paramVO) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsonView");
        loginService.insertUser(paramVO);
        return mv;
    }
}
