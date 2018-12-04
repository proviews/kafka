package com.kafka.demo.service;

import com.kafka.demo.dao.UserMapper;
import com.kafka.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> qryAll() {
        List<User> list = userMapper.selectAll();
        return list;
    }
}
