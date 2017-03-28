package com.websystique.springsecurity.dao;

import com.websystique.springsecurity.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
    public User findByUserName(String id) {
        return (User) getSession().get(User.class, id);
    }
}