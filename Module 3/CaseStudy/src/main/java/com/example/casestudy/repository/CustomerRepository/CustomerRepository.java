package com.example.casestudy.repository.CustomerRepository;

import com.example.casestudy.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final List<Customer> list;
    static {
        list = new ArrayList<>();
        list.add(new Customer(1, "Nguyen Van A", "0901234567", "nguyenvana@gmail.com", "Ha Noi"));
        list.add(new Customer(2, "Tran Thi B", "0987654321", "tranthib@gmail.com", "Ho Chi Minh"));
        list.add(new Customer(3, "Nguyen Thanh Cong", "0912345678", "cong.nguyen@gmail.com", "Da Nang"));
        list.add(new Customer(4, "Tran Hong Quan", "0934722669", "quantran11052005@gmail.com", "Da Nang"));
        list.add(new Customer(5, "Le Van Tai", "0912345678", "levantai@gmail.com", "Da Nang"));
    }

    @Override
    public List<Customer> findAllCustomer() {
        return list;
    }
}
