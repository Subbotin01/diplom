package com.websystique.springsecurity.dao;
import com.websystique.springsecurity.model.Product;
import com.websystique.springsecurity.dao.ProductDaoImpl;
/**
 * Created by Павел on 14.04.2017.
 */
public interface ProductDao {

    Product findByUserName(String username);
}