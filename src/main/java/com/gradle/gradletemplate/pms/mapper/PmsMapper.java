package com.gradle.gradletemplate.pms.mapper;

import com.gradle.gradletemplate.board.vo.BoardVO;
import com.gradle.gradletemplate.pms.vo.PmsVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface PmsMapper {

	int getPmsCnt(PmsVO paramVO);

	List<PmsVO> selectPmsList(PmsVO paramVO);

	Map<String, Object> getDatePeriod(PmsVO paramVO);
}