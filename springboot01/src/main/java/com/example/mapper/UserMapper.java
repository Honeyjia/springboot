package com.example.mapper;

import com.example.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface UserMapper extends Mapper<User> {

}
