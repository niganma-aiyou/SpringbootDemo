/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.controller;

import com.example.springdemo.pojo.UserDepartmentVO;
import com.example.springdemo.service.UserDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 user控制器
 *
 * @author chuweiyuan
 * @module 多表查询
 * @date 2022/8/2 15:29
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */

@RestController
public class UserDeController {

    @Autowired
    private UserDeService userDeService;

    @RequestMapping("userDepartment")
    public List<UserDepartmentVO> selectUserDe(){
        return userDeService.selectUserDe();
    }
}
