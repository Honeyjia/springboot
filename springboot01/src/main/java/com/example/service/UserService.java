package com.example.service;


import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //根据id查询
    public User findUserById(long id){
        return userMapper.selectByPrimaryKey(id);
    }


    public void saveUser(User user){
        //选择性新增 如果属性为空，则该属性不会出现在insert语句中
        userMapper.insertSelective(user);
        System.out.println("新增用户...");
    }
}
