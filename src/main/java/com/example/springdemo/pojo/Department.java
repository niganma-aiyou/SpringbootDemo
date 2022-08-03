/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 部门内容
 *
 * @author chuweiyuan
 * 练习多表查询
 * @date 2022/8/2 14:17
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
@Data
@Accessors(chain = true)
public class Department implements Serializable {
    private int id ;
    private String name;
    private String work;

    private User user;
}
