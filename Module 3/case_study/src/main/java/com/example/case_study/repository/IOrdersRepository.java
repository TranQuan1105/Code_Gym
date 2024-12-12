package com.example.case_study.repository;

import com.example.case_study.model.Orders;
import java.util.List;

public interface IOrdersRepository {
    boolean createOrder(Orders order);
    List<Orders> getAllOrders();
    Orders getOrderById(int orderId);
    boolean deleteOrder(int orderId);
}
