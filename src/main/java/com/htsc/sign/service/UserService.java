package com.htsc.sign.service;

import com.htsc.sign.model.User;

/**
 * created by Kimone
 * date 2020/9/1
 */
public interface UserService {
    User createUser(User user);

    User findByNameAndPsw(String username, String password);

    User findByName(String username);
}
