package com.junda.springbootmall.dao;

import com.junda.springbootmall.model.Order;
import com.junda.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer ordertId, List<OrderItem> orderItemList);
}
