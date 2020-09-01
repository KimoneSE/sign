package com.htsc.sign.dao;

import com.htsc.sign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Kimone
 * date 2020/9/1
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username,String password);

    User findByUsername(String username);
}
