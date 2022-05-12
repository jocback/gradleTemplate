package com.gradle.gradletemplate.board.vo;

import com.gradle.gradletemplate.common.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO extends PageVO {

    private String boardNo;
    private String boardType;
    private String title;
    private String contents;
    private String userId;
    private String createdTime;
    private String updatedTime;
    private String likes;
    private String counts;

}