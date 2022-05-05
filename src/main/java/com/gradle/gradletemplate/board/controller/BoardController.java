package com.gradle.gradletemplate.board.controller;

import com.gradle.gradletemplate.board.service.BoardService;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/board/boardList", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView boardList() {
        ModelAndView mv = new ModelAndView();
        String str = boardService.selectTest();
        System.out.println(str);
        mv.setViewName("board/boardList");
        return mv;
    }

    @RequestMapping(value = "/board/selectBoardList", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ModelAndView selectBoardList() {
        ModelAndView mv = new ModelAndView();
        List<Map<String, Object>> boardList = new ArrayList<Map<String, Object>>();
        boardList = boardService.selectBoardList();
        mv.addObject("boardList", boardList);
        mv.setViewName("jsonView");
        return mv;
    }
}
