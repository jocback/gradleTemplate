package com.gradle.gradletemplate.pms.controller;

import com.gradle.gradletemplate.board.vo.BoardVO;
import com.gradle.gradletemplate.pms.service.PmsService;
import com.gradle.gradletemplate.pms.vo.PmsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PmsController {

	@Autowired
	private PmsService pmsService;
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
        mav.setViewName("pms/pmsList");
        return mav;
    }

	/**
	 * @title 게시판 목록 조회
	 * @param  BoardVO
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/pms/selectPmsList", method = {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public ModelAndView selectBoardList(PmsVO paramVO) {
		ModelAndView mv = new ModelAndView();
		Map<String, Object> boardMap = new HashMap<>();
		boardMap = pmsService.selectPmsList(paramVO);
		mv.addObject("pmsMap", boardMap);
		mv.setViewName("jsonView");
		return mv;
	}


}