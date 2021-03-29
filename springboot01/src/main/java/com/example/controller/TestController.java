package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class TestController {

    @Autowired//注入DataSorurce属性
    private DataSource dataSource;

    @RequestMapping("hello")
    public String hello(){
        System.out.println(dataSource);
        return "hello springboot!";
    }
}
