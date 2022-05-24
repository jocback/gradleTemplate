package com.gradle.gradletemplate.login.controller;

import com.gradle.gradletemplate.login.service.LoginService;
import com.gradle.gradletemplate.login.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login/login", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/login");
        return mv;
    }

    @RequestMapping(value = "/login/loginProcess", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView loginProcess() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsonView");
        mv.addObject("result", "loginProcess");
        return mv;
    }

    @RequestMapping(value = "/login/register", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/register");
        return mv;
    }

    @RequestMapping(value = "/login/signUp", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelAndView signUp(UserVO paramVO) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsonView");
        loginService.insertUser(paramVO);
        return mv;
    }
}
