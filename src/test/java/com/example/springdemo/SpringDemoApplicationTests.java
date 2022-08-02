package com.example.springdemo;

import com.example.springdemo.mapper.UserMapper;
import com.example.springdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class SpringDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectAllTest(){
        List<User> userList = userMapper.selectAll();

        for (User user:userList){
            System.out.println(user);
        }
        Assert.notEmpty(userList,"用户不存在");
    }

}
