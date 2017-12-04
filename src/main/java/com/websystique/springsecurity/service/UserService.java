package com.websystique.springsecurity.service;

import com.websystique.springsecurity.model.Product;
import com.websystique.springsecurity.model.User;

import java.util.List;

public interface UserService {
        User findByUserName(String username);
        List<User> getAll();
      //  List<Product> getAll2();
        void deleteUser(String username);
        void editeUser(String username, String pass);
        void addUser(String username, String pass);
}