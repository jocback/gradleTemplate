package com.gradle.gradletemplate.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PmsController {

/*
    @RequestMapping(value = "/board/selectBoardList", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ModelAndView selectBoardList(BoardVO paramVO) {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> boardMap = new HashMap<>();
        boardMap = boardService.selectBoardList(paramVO);
        mv.addObject("boardMap", boardMap);
        mv.setViewName("jsonView");
        return mv;
    }
 */
    @RequestMapping(value = "/pms/pmsList", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView pmsList() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/pms/pmsList");
        return mav;
    }

    @RequestMapping(value = "/pms/selectPmsList", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView selectPmsList(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("jsonView");
        return mav;
    }


}