package com.gradle.gradletemplate.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VueController {

    /**
     * @title  Vue 샘플 페이지
     * @return ModelAndView
     */
    @RequestMapping(value = "/vue/vue", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView boardList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("vue/vue");
        return mv;
    }

}
