package com.gradle.gradletemplate.board.controller;

import com.gradle.gradletemplate.board.service.BoardService;
import com.gradle.gradletemplate.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * @title  게시판리스트 화면
     * @return ModelAndView
     */
    @RequestMapping(value = "/board/boardList", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView boardList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("board/boardList");
        return mv;
    }

    /**
     * @title 게시판 목록 조회
     * @param  BoardVO
     * @return ModelAndView
     */
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

    /**
     * @title 게시판 목록 상세 화면
     * @return ModelAndView
     */
    @RequestMapping(value = "/board/boardDetail", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView boardDetail() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("board/boardDetail");
        return mv;
    }

    /**
     * @title 게시판 목록 상세 조회
     * @param  String
     * @return ModelAndView
     */
    @RequestMapping(value = "/board/selectBoardDetail", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ModelAndView selectBoardDetail(String boardNo) {
        ModelAndView mv = new ModelAndView();
        Map<String, Object> boardMap = new HashMap<String, Object>();
        boardMap = boardService.selectBoardDetail(boardNo);
        mv.addObject("boardMap", boardMap);
        mv.setViewName("jsonView");
        return mv;
    }

    /**
     * @title 게시판 등록
     * @param  BoardVO
     * @return ModelAndView
     */
    @RequestMapping(value = "/board/insertBoard", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ModelAndView insertBoard(BoardVO paramVO) {
        ModelAndView mv = new ModelAndView();
        boardService.insertBoard(paramVO);
        mv.setViewName("jsonView");
        return mv;
    }

    /**
     * @title 게시판 수정
     * @param  BoardVO
     * @return ModelAndView
     */
    @RequestMapping(value = "/board/updateBoard", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ModelAndView updateBoard(BoardVO paramVO) {
        ModelAndView mv = new ModelAndView();
        boardService.updateBoard(paramVO);
        mv.setViewName("jsonView");
        return mv;
    }

    /**
     * @title 게시판 삭제
     * @param  BoardVO
     * @return ModelAndView
     */
    @RequestMapping(value = "/board/deleteBoard", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ModelAndView deleteBoard(BoardVO paramVO) {
        ModelAndView mv = new ModelAndView();
        boardService.deletBoard(paramVO);
        mv.setViewName("jsonView");
        return mv;
    }
}
