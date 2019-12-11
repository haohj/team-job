package com.hao.teamjob;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableSwagger2Doc
@EnableScheduling
public class TeamJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamJobApplication.class, args);
    }

}
