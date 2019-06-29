package com.tiandd.springcloud01.dao.master;

import com.tiandd.springcloud01.pojo.master.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> selectUserById(User user);
}
