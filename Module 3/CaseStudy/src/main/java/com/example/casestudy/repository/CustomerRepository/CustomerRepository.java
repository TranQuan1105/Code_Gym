package com.example.casestudy.repository.CustomerRepository;

import com.example.casestudy.model.Customer;
import com.example.casestudy.repository.BaseRepository;
import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
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

    private static final String FIND_ALL_CUSTOMER = "SELECT * FROM customer";

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> list= new ArrayList<>();
        BaseRepository baseRepository = new BaseRepository();
        Connection connection = baseRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(FIND_ALL_CUSTOMER);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                list.add(new Customer(name, phone, email, address));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void save(Customer customer) {
        list.add(customer);
    }

    @Override
    public Customer findCustomerById(int id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    private static final String DELETE_CUSTOMER_BY_ID = "DELETE FROM customer WHERE id = ?";

    @Override
    public void deleteCustomerById(int id) {
        BaseRepository baseRepository = new BaseRepository();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                System.out.println("No customer found with id: " + id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
