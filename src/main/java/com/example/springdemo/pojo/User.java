package com.example.springdemo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author chuweiyuan
 */

@Data
@Accessors(chain = true)
public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;


    private Department department;

}
