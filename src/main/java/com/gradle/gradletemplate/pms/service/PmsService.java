package com.gradle.gradletemplate.pms.service;

import com.gradle.gradletemplate.board.vo.BoardVO;
import com.gradle.gradletemplate.pms.mapper.PmsMapper;
import com.gradle.gradletemplate.pms.vo.PmsVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PmsService {

	@Autowired
	private PmsMapper pmsMapper;

	public Map<String, Object> selectPmsList(PmsVO paramVO) {
		List<PmsVO> pmsList = new ArrayList<PmsVO>();
		int pmsCnt = pmsMapper.getPmsCnt(paramVO);
		pmsList = pmsMapper.selectPmsList(paramVO);
		Map<String, Object> periodMap = pmsMapper.getDatePeriod(paramVO);
		Map<String, Object> pmsMap = new HashMap<>();
		pmsMap.put("pmsList", pmsList);
		pmsMap.put("pmsCnt", pmsCnt);
		pmsMap.put("periodMap", periodMap);

		return pmsMap;
	}

}