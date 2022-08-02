/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.service;

import com.example.springdemo.mapper.UserMapper;
import com.example.springdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 *
 * @author chuweiyuan
 * @module 编写Userservice，service层主要负责业务模块的逻辑应用设计，具体要调用到已定义的DAO层的接口
 * @date 2022/8/2 8:12
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public User selectOneUser(int id){
        return userMapper.selectOneUser(id);
    }
}
