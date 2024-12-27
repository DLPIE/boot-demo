package com.dl.dao;

import com.dl.mapper.UserMapper;
import com.dl.pojo.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDao {
    @Resource
    private UserMapper userMapper;

    public User queryById(int id){
        return userMapper.queryById(id);
    }
}
