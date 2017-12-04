package com.websystique.springsecurity.service;

import com.websystique.springsecurity.dao.ProductDaoImpl;
import com.websystique.springsecurity.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.model.User;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDaoImpl dao;


    public User findByUserName(String username) {
        return dao.findByUserName(username);
    }

    @Override
    public List<User> getAll() {
        return dao.getAllEntity();
    }
    @Override
    public void deleteUser(String username){
        dao.delete(dao.findByUserName(username));
    }

    public void editeUser(String username,String pass){
            User user= new User();
            user.setUsername(user.getUsername());

            user.setPassword(user.getPassword());
            dao.save(user);
        } ;





    public void addUser(String username, String pass){
        User user= new User();
        user.setUsername(username);
        user.setEnabled(true);
        user.setPassword(pass);
        dao.save(user);
    } ;

}