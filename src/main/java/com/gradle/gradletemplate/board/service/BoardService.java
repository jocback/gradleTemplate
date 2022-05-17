package com.gradle.gradletemplate.board.service;

import com.gradle.gradletemplate.board.mapper.BoardMapper;
import com.gradle.gradletemplate.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public String selectTest() {
        return boardMapper.selectTest();
    }

    public Map<String, Object> selectBoardList(BoardVO paramVO) {
        List<BoardVO> boardList = new ArrayList<BoardVO>();
        int boardCnt = boardMapper.getBoardCnt(paramVO);
        boardList = boardMapper.selectBoardList(paramVO);
        Map<String, Object> boardMap = new HashMap<>();
        boardMap.put("boardList", boardList);
        boardMap.put("boardCnt", boardCnt);

        return boardMap;
    }

    public Map<String, Object> selectBoardDetail(String boardNo) {
        Map<String, Object> boardMap = new HashMap<String, Object>();
        boardMap = boardMapper.selectBoardDetail(boardNo);
        return boardMap;
    }

    public void insertBoard(BoardVO paramVO) {
        boardMapper.insertBoard(paramVO);
    }

    public void updateBoard(BoardVO paramVO) {
        boardMapper.updateBoard(paramVO);
    }

    public void deletBoard(BoardVO paramVO) {
        boardMapper.deleteBoard(paramVO);
    }

}
