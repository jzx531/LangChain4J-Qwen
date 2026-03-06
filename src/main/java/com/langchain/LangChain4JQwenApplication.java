package com.langchain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.langchain.mapper")
@SpringBootApplication
public class LangChain4JQwenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangChain4JQwenApplication.class, args);
    }

}
