package com.example.casestudy.sevice.CustomerService;

import com.example.casestudy.model.Customer;
import com.example.casestudy.repository.CustomerRepository.CustomerRepository;
import com.example.casestudy.repository.CustomerRepository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAllCustomer();
    }
}
