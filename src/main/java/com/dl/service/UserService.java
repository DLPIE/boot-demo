package com.dl.service;

import com.dl.dao.UserDao;
import com.dl.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public User queryById(int id){
        return userDao.queryById(id);
    }
}
