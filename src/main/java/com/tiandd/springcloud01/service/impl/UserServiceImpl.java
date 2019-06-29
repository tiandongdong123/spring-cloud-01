package com.tiandd.springcloud01.service.impl;

import com.tiandd.springcloud01.dao.master.UserDao;
import com.tiandd.springcloud01.pojo.master.User;
import com.tiandd.springcloud01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<User> getUserById(User user) {
        return userDao.selectUserById(user);
    }
}
