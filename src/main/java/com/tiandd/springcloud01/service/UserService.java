package com.tiandd.springcloud01.service;

import com.tiandd.springcloud01.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserById(User user);
}
