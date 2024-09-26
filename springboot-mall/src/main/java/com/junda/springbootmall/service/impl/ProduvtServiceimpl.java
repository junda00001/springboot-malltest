package com.junda.springbootmall.service.impl;

import com.junda.springbootmall.dao.ProductDao;
import com.junda.springbootmall.model.Product;
import com.junda.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProduvtServiceimpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
