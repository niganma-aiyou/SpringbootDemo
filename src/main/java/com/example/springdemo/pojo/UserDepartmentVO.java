/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package com.example.springdemo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户对象（含部门）
 *
 * @author chuweiyuan
 * @module multi-table select
 * @date 2022/8/2 14:44
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */

@Data
@Accessors(chain = true)
public class UserDepartmentVO implements Serializable {
    private Integer depId;
    private String depName;
    private String work;

    private Integer id;
    private String username;
    private Integer age;
    private String phoneNumber;
}
