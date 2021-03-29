package com.example.pojo;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.util.Date;

@lombok.Data
@Table(name = "tb_user")
public class User {
    @Id
    //开启主键回填
    @KeySql(useGeneratedKeys = true)
    //如果字段符合驼峰规则或者和数据库中的字段名称一致，则可以不加注解，否则使用 @Column
    private long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Data created;
    private Data updated;
}
