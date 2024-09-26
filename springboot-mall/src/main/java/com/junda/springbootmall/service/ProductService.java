package com.junda.springbootmall.service;

import com.junda.springbootmall.dto.ProductRequest;
import com.junda.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}

