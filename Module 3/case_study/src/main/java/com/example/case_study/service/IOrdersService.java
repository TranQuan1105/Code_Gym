package com.example.case_study.service;

import com.example.case_study.model.Orders;
import java.util.List;

public interface IOrdersService {
    boolean createOrder(Orders order);
    List<Orders> getAllOrders();
    Orders getOrderById(int orderId);
    boolean deleteOrder(int orderId);
}
