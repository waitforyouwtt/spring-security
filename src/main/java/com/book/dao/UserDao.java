package com.book.dao;

import com.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 一点点
 * @Date: 2018/11/25 9:56
 * @Version 1.0
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
