package com.example.config;

//@Configuration
//@PropertySource("classpath:jdbc.properties") //添加外部属性配置文件

//@EnableConfigurationProperties(JdbcProperties.class)//声明要使用JdbcProperties 这个类的对象
public class JdbcConfig {
    /*@Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;*/

    /*@Bean
    public DataSource getDataSource(JdbcProperties jdbc){
      *//*  DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;*//*
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setPassword(jdbc.getUsername());
        return dataSource;
    }*/

  /*  @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }*/
}