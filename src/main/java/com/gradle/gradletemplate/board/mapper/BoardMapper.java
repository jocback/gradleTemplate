package com.gradle.gradletemplate.board.mapper;

import com.gradle.gradletemplate.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    // 샘플 조회
    String selectTest();

    int getBoardCnt(BoardVO paramVO);

    List<BoardVO> selectBoardList(BoardVO paramVO);

    Map<String, Object> selectBoardDetail(String boardNo);
}
