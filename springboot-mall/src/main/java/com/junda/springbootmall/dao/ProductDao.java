package com.junda.springbootmall.dao;

import com.junda.springbootmall.model.Product;
//import org.springframework.web.util.pattern.PathPattern;

public interface ProductDao {

    Product getProductById(Integer productId);
}
