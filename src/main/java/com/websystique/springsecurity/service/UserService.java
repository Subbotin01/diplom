package com.websystique.springsecurity.service;

import com.websystique.springsecurity.model.User;

import java.util.List;

public interface UserService {
        User findByUserName(String username);
        List<User> getAll();
        void deleteUser(String username);
        void addUser(String username, String pass);
}