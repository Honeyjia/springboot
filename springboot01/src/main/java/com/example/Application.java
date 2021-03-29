package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描所有业务的mapper接口
@MapperScan(basePackages = {"com.example.mapper"}) //使用通用mapper，以tk开头
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
