package com.gradle.gradletemplate.board.controller;

import com.gradle.gradletemplate.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/board/boardList", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView boardList() {
        ModelAndView mv = new ModelAndView();
        String str = boardService.selectTest();
        System.out.println(str);
        mv.setViewName("/board/boardList");
        return mv;
    }
}
