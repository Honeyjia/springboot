package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*注解声明当前类为属性读取类
prefix为读取属性文件中，前缀为jdbc的值。
Spring Boot默认读取的属性文件名为：application.properties/application.yml
 */
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    //生成 getter 和 setter 方法
    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
