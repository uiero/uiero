package com.uiero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuwei
 */
@SpringBootApplication
@MapperScan("com.uiero.spring.mapper")
public class StudySpringbootApplication {

    public static void main(String[] args) {
        System.out.println("创建dev分支");
        SpringApplication.run(StudySpringbootApplication.class, args);
    }

}
