package com.gradle.gradletemplate.map.controller;

import com.gradle.gradletemplate.map.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MapController {

    @Autowired
    private MapService mapService;

    /**
     * @title  게시판리스트 화면
     * @return ModelAndView
     */
    @RequestMapping(value = "/map/mapMain", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView mapMain() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("map/mapMain");
        return mv;
    }
}
