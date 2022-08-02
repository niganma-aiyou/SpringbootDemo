package com.example.springdemo.controller;

import com.example.springdemo.pojo.User;
import com.example.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chuweiyuan
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectAll();
    }

    @RequestMapping("selectOneUser")
    public User selectOneUser(int id){
        return userService.selectOneUser(id);
    }

}
