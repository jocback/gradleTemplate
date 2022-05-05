package com.gradle.gradletemplate.board.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    // 샘플 조회
    String selectTest();
}
