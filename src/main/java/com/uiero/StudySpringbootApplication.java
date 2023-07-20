package com.uiero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuwei 增加测试分支注释、增加注释1
 */
@SpringBootApplication
@MapperScan("com.uiero.spring.mapper")
public class StudySpringbootApplication {

    public static void main(String[] args) {
        System.out.println("测试分支");
        SpringApplication.run(StudySpringbootApplication.class, args);
    }

}
