package com.websystique.springsecurity.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import com.websystique.springsecurity.model.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    @SuppressWarnings("unchecked")
    public AbstractDao(){
        this.persistentClass =(Class<T>) ((ParameterizedType)
                this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }


    public void delete(T entity) {
        getSession().delete(entity);
    }
    public void edit(T entity) {
        getSession().delete(entity);
    }
    public void save(T entity) {
        getSession().save(entity);
    }


    public void persist1(T product) {
        getSession().persist(product);
    }


    public void delete1(T product) {
        getSession().delete(product);
    }
    public void edit1(T product) {
        getSession().delete(product);
    }
    public void save1(T product) {
        getSession().save(product);
    }



    public List<T> getAllEntity(){
        List entityList = new ArrayList<>();
      // entityList = getSession().createQuery("from Product").list();
       entityList = getSession().createQuery("from User").list();
        return entityList;
    }
    public List<T> getAllProduct(){
        List productList = new ArrayList<>();
        productList = getSession().createQuery(" from Product").list();
       // productList = getSession().createQuery("from User").list();
        return productList;
    }


    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistentClass);
    }

}