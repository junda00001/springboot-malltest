package com.junda.springbootmall.service;

import com.junda.springbootmall.constant.ProductCategory;
import com.junda.springbootmall.dto.ProductRequest;
import com.junda.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


}

