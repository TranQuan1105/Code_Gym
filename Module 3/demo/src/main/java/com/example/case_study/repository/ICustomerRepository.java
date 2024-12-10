package com.example.case_study.repository;

import com.example.case_study.model.Customer;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int id);
}