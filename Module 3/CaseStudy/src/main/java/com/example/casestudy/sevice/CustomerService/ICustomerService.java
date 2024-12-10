package com.example.casestudy.sevice.CustomerService;

import com.example.casestudy.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findCustomerById(int id);
    void     deleteCustomerById(int id);
}
