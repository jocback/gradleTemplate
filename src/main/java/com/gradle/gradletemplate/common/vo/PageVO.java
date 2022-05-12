package com.gradle.gradletemplate.common.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageVO {


    private String pageNo;
    private int perPage;
    private String totalCnt;
    private int startPage;
    private int endPage;

    private String getPageNo() {
        if(pageNo==null) {
            return "1";
        }else {
            return pageNo;
        }
    }

    public int getStartPage() {
        return (Integer.parseInt(getPageNo())-1)*getPerPage();
    }
    public int getEndPage() {
        return Integer.parseInt(getPageNo())*getPerPage();
    }

    public int getPerPage() {
        if(perPage==0) {
            return 10;
        }else{
            return perPage;
        }
    }

}