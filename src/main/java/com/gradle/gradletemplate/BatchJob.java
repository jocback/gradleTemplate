package com.gradle.gradletemplate;

import com.gradle.gradletemplate.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BatchJob {

//    @Scheduled(fixedDelay = 2000)
//    public void task1() {
//        System.out.println("The current date(1) :"+ LocalDateTime.now());
//    }
}
