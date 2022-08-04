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

    /**
     * show 查询所有
     * @return 返回一个user对象
    * */
    List<User> selectAll();

    /**
     * show 查询一些
     * @return 返回一个user对象
     * */
    List<User> selectSomething();

    /**
     * show 通过id查询
     * @return 返回一个user对象
     * @param id  id是员工id
     * */
    @Select("select * from tb_user where id = #{id}")
    User selectOneUser(int id);
}
