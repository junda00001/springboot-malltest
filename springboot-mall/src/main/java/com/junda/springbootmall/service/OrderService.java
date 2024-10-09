package com.junda.springbootmall.service;

import com.junda.springbootmall.dto.CreateOrderRequest;
import com.junda.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
