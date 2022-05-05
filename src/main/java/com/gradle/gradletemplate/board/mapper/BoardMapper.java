package com.gradle.gradletemplate.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    // 샘플 조회
    String selectTest();

    List<Map<String, Object>> selectBoardList();
}
