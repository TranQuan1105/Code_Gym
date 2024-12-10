package com.example.case_study.model;

import com.example.case_study.repository.ICustomerRepository;

public class Customer {
    private int customerId;
    private String name;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String name, String phone, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(String address, String email, String phone, String name) {
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

