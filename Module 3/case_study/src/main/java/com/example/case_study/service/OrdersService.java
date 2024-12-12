package com.example.case_study.service;

import com.example.case_study.model.Orders;
import com.example.case_study.repository.IOrdersRepository;
import com.example.case_study.repository.OrdersRepository;
import com.example.case_study.service.IOrdersService;

import java.util.List;

public class OrdersService implements IOrdersService {
    private final IOrdersRepository ordersRepository;

    public OrdersService() {
        this.ordersRepository = new OrdersRepository();
    }

    @Override
    public boolean createOrder(Orders order) {
        return ordersRepository.createOrder(order);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersRepository.getAllOrders();
    }

    @Override
    public Orders getOrderById(int orderId) {
        return ordersRepository.getOrderById(orderId);
    }

    @Override
    public boolean deleteOrder(int orderId) {
        return ordersRepository.deleteOrder(orderId);
    }
}