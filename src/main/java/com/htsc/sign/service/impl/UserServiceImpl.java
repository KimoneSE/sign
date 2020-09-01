package com.htsc.sign.service.impl;

import com.htsc.sign.dao.UserDao;
import com.htsc.sign.model.User;
import com.htsc.sign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by Kimone
 * date 2020/9/1
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User findByNameAndPsw(String username, String password) {
        return userDao.findByUsernameAndPassword(username,password);
    }

    @Override
    public User findByName(String username) {
        return userDao.findByUsername(username);
    }
}
