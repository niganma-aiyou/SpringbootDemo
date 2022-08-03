package com.example.springdemo;

import com.example.springdemo.mapper.UserDeMapper;
import com.example.springdemo.mapper.UserMapper;
import com.example.springdemo.pojo.User;
import com.example.springdemo.pojo.UserDepartmentVO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class SpringDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDeMapper userDeMapper;

    @Test
    void selectAllTest(){
        List<User> userList = userMapper.selectAll();

        for (User user:userList){
            System.out.println(user);
        }
        Assertions.assertThat(userList).isNotEmpty();
    }

    @Test
    void selectUserDepartment(){
        List<UserDepartmentVO> userDepartmentVO = userDeMapper.selectUserDepartment();
        for (UserDepartmentVO ud: userDepartmentVO){
            System.out.println(ud);
        }
        Assertions.assertThat(userDepartmentVO).isNotEmpty();
    }

}
