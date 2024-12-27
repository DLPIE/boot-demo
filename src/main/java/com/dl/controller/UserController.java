package com.dl.controller;

import com.dl.base.UserRequest;
import com.dl.base.UserResponse;
import com.dl.pojo.User;
import com.dl.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public UserResponse queryUser(@RequestBody UserRequest request){
        User user = userService.queryById(request.getUserId());
        return new UserResponse(user);
    }
}
