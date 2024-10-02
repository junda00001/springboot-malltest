package com.junda.springbootmall.dao;

import com.junda.springbootmall.dto.ProductQueryParams;
import com.junda.springbootmall.dto.ProductRequest;
import com.junda.springbootmall.model.Product;

import java.util.List;
//import org.springframework.web.util.pattern.PathPattern;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct (ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductId(Integer productId);

}
