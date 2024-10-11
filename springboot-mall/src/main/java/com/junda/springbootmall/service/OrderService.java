package com.junda.springbootmall.service;

import com.junda.springbootmall.dto.CreateOrderRequest;
import com.junda.springbootmall.dto.OrderQueryParams;
import com.junda.springbootmall.model.Order;
import com.junda.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
