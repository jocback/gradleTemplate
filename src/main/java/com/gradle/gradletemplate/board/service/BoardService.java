package com.gradle.gradletemplate.board.service;

import com.gradle.gradletemplate.board.mapper.BoardMapper;
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

    public List<Map<String, Object>> selectBoardList() {
        List<Map<String, Object>> maplist = new ArrayList<Map<String, Object>>();
        maplist = boardMapper.selectBoardList();
        return maplist;
    }

    public Map<String, Object> selectBoardDetail(String boardNo) {
        Map<String, Object> boardMap = new HashMap<String, Object>();
        boardMap = boardMapper.selectBoardDetail(boardNo);
        return boardMap;
    }
}
