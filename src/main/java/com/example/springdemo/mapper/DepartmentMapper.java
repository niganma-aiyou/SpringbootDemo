/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.mapper;

import com.example.springdemo.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 部门接口
 *
 * @author chuweiyuan
 * @module 多表查询
 * @date 2022/8/2 14:38
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
@Mapper
public interface DepartmentMapper {
    @Select("select * from tb_dep where dep_id = #{id}")
    Department getDepertmantById(int id);
}

