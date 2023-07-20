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

    /**
     * 功能描述:
     * 〈main〉
     *
     * @param args args
     * @return : void
     * @author : yuwei
     * @date : 2023/7/20 16:16
     */
    public static void main(String[] args) {
        System.out.println("创建dev分支");
        System.out.println("创建dev分支1");
        System.out.println("测试分支");
        SpringApplication.run(StudySpringbootApplication.class, args);
        //开发分支增加注释
        //开发分支增加注释1
    }

}
