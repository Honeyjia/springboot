package com.example.config;

import com.example.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class mvcConfig implements WebMvcConfigurer{
    //将拦截器注册到spring容器

    @Bean
    public MyInterceptor getInterceptor(){
        return new MyInterceptor();
    }

    //拦截器重添加自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //通过registry添加myInterceptor拦截器，并设置拦截器路径为 /*
        registry.addInterceptor(getInterceptor()).addPathPatterns("/*");
    }
}
