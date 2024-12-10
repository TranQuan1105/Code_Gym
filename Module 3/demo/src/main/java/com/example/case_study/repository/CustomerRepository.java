package com.example.case_study.repository;

import com.example.case_study.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String URL = "jdbc:mysql://localhost:3306/library_management";
    private final String Username = "root";
    private final String Password = "quan11052005";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, Username, Password);
    }

    private static final List<Customer> customers;
    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Nguyen Van A", "0901234567", "nguyenvana@gmail.com", "Ha Noi"));
        customers.add(new Customer(2, "Tran Thi B", "0987654321", "tranthib@gmail.com", "Ho Chi Minh"));
        customers.add(new Customer(3, "Nguyen Thanh Cong", "0912345678", "cong.nguyen@gmail.com", "Da Nang"));
        customers.add(new Customer(4, "Tran Hong Quan", "0934722669", "quantran11052005@gmail.com", "Da Nang"));
        customers.add(new Customer(5, "Le Van Tai", "0912345678", "levantai@gmail.com", "Da Nang"));
    }
    private static final String FIND_ALL_CUSTOMER = "SELECT * FROM customer";
    private static final String FIND_CUSTOMER_BY_ID = "SELECT * FROM customer WHERE customer_id = ?";
    private static final String ADD_CUSTOMER = "INSERT INTO customer (name, phone, email, address) VALUES (?, ?, ?, ?)";
    private static final String UPDATE_CUSTOMER = "UPDATE customer SET name = ?, phone = ?, email = ?, address = ? WHERE customer_id = ?";
    private static final String DELETE_CUSTOMER = "DELETE FROM customer WHERE customer_id = ?";

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FIND_ALL_CUSTOMER)) {
            while (resultSet.next()) {
                customers.add(new Customer(
                        resultSet.getString("name"),
                        resultSet.getString("phone"),
                        resultSet.getString("email"),
                        resultSet.getString("address")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_CUSTOMER_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Customer(
                        resultSet.getInt("customer_id"),
                        resultSet.getString("name"),
                        resultSet.getString("phone"),
                        resultSet.getString("email"),
                        resultSet.getString("address")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_CUSTOMER)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getPhone());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getAddress());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getPhone());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setInt(5, customer.getCustomerId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER)) {
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
