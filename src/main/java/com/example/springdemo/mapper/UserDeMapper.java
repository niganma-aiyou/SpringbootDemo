/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.mapper;

import com.example.springdemo.pojo.UserDepartmentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 uerDe接口
 * @author chuweiyuan
 * @module 多表查询
 * @date 2022/8/2 14:47
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */

@Mapper
public interface UserDeMapper {
    List<UserDepartmentVO> selectUserDepartment();
}
