package com.gradle.gradletemplate.board.service;

import com.gradle.gradletemplate.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public String selectTest() {
        return boardMapper.selectTest();
    }
}
