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

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(int id) {
        return this.iCustomerRepository.findCustomerById(id);
    }

    @Override
    public void deleteCustomerById(int id) {
//        CustomerRepository.deleteCustomerById(id);
    }

}
