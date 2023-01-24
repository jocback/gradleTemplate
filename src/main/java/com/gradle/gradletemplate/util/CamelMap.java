/******************************************************************************************
 * 본프로그램 소스코드는 케이엘큐브의 사전승인 없이 임의복제, 복사, 배포할 수 없음
 * 
 * Copyright (C) 2022 by KLCUBE. All rights reserved. 
 ******************************************************************************************/
package com.gradle.gradletemplate.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * @title  Camelcase Map
 * @author Brian
 * @since  2022. 02. 28.
 */
public class CamelMap extends HashMap<String, Object> {

	private static final long serialVersionUID = 2216439432034105320L;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private String toProperCase(String s, boolean isCapital) {
		String rtnValue = "";

        if(isCapital) {
        	rtnValue = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        } else {
            rtnValue = s.toLowerCase();
        }
        
        return rtnValue;
    }
	
	private String toCamelCase(String s) {
		String[] parts = s.split("_");
        StringBuilder camelCaseString = new StringBuilder();

        for(int i=0; i<parts.length; i++) {
            String part = parts[i];
            camelCaseString.append(toProperCase(part, (i != 0 ? true : false)));
        }

        return camelCaseString.toString();
    }
	
	@Override
    public Object put(String key, Object value) {
        return super.put((String) toCamelCase(key), value);
    }
	
	/*@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}*/
	
	/*@Override
	public String toString() {
		try {
			return objectMapper.writeValueAsString(this);
		} catch (Exception e) {
			return this.toString();
		}
	}*/
}