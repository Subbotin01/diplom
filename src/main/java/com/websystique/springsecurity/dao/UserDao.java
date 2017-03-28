package com.websystique.springsecurity.dao;

import com.websystique.springsecurity.model.User;
import com.websystique.springsecurity.dao.UserDaoImpl;

public interface UserDao {

    User findByUserName(String username);
}