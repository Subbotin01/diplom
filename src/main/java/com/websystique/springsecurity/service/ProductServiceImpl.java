package com.websystique.springsecurity.service;

import com.websystique.springsecurity.dao.ProductDaoImpl;
import com.websystique.springsecurity.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Павел on 14.04.2017.
 */

@Service("productService")
@Transactional
public class ProductServiceImpl implements  ProductService {


    @Autowired
    private ProductDaoImpl productDao;






        public Product findByProductName(String Name) {
            return productDao.findByUserName(Name);
        }

        @Override
        public void deleteProduct(String Name){
            productDao.delete(productDao.findByProductName(Name));
        }





    @Override
    public List<Product> getAll2() {
        return productDao.getAllProduct();
    }

}
