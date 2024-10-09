package com.junda.springbootmall.dao;

import com.junda.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer ordertId, List<OrderItem> orderItemList);
}
