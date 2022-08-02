package com.example.springdemo.mapper;

import com.example.springdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author chuweiyuan
 */
@Mapper
public interface UserMapper {
    List<User> selectAll();

    List<User> selectSomething();

    @Select("select * from tb_user where id = #{id}")
    User selectOneUser(int id);
}
