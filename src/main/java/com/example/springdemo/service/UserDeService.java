/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.service;

import com.example.springdemo.mapper.UserDeMapper;
import com.example.springdemo.pojo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *userService
 * @author chuweiyuan
 * @module 多表查询
 * @date 2022/8/2 15:30
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
@Service
public class UserDeService {

    @Autowired
    private UserDeMapper userDeMapper;

    public List<UserDepartmentVO> selectUserDe(){
        return userDeMapper.selectUserDepartment();
    }

}
