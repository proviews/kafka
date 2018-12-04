package com.kafka.demo.dao;

import com.kafka.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}