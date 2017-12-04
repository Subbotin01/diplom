package com.websystique.springsecurity.dao;

import com.websystique.springsecurity.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Павел on 14.04.2017.
 */

@Repository("productDao")
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements ProductDao {

    @Override
   public Product findByUserName(String Name)
    {
         return (Product) getSession().get(Product.class, Name);
      }


    public Product findByProductName(String Name)
    {
        return (Product) getSession().get(Product.class, Name);
    }
}
