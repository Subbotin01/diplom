package com.websystique.springsecurity.service;

import com.websystique.springsecurity.model.Product;

import java.util.List;

/**
 * Created by Павел on 14.04.2017.
 */
public interface ProductService {

    Product findByProductName(String Name);
    List<Product> getAll2();
    void deleteProduct (String Name);
    }