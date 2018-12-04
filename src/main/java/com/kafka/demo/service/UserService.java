package com.kafka.demo.service;

import com.kafka.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> qryAll();
}
