package com.gradle.gradletemplate.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping(value="/index", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/sample/dashboard", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView dashboard() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sample/dashboard");
        return mv;
    }

//    @GetMapping("/")
//    public String index(ModelMap model) throws Exception {
//        return "index";
//    }


}
