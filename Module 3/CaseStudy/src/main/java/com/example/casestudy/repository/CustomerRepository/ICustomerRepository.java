package com.example.casestudy.repository.CustomerRepository;

import com.example.casestudy.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAllCustomer();
    void save(Customer customer);
    Customer findCustomerById(int id);
    void deleteCustomerById(int id);
}
