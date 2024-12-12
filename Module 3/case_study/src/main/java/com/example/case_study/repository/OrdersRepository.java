package com.example.case_study.repository;

import com.example.case_study.model.Orders;
import com.example.case_study.repository.IOrdersRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersRepository implements IOrdersRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/library_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "quan11052005";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }



    @Override
    public boolean createOrder(Orders order) {
        String query = "INSERT INTO orders (customer_id, book_id, borrow_date, return_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, order.getCustomerId());
            stmt.setInt(2, order.getBookId());
            stmt.setDate(3, new java.sql.Date(order.getBorrowDate().getTime()));
            stmt.setDate(4, order.getReturnDate() != null ? new java.sql.Date(order.getReturnDate().getTime()) : null);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> ordersList = new ArrayList<>();
        String query = "SELECT * FROM orders";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Orders order = new Orders(
                        rs.getInt("order_id"),
                        rs.getInt("customer_id"),
                        rs.getInt("book_id"),
                        rs.getDate("borrow_date"),
                        rs.getDate("return_date")
                );
                ordersList.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ordersList;
    }

    @Override
    public Orders getOrderById(int orderId) {
        String query = "SELECT * FROM orders WHERE order_id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Orders(
                        rs.getInt("order_id"),
                        rs.getInt("customer_id"),
                        rs.getInt("book_id"),
                        rs.getDate("borrow_date"),
                        rs.getDate("return_date")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteOrder(int orderId) {
        String query = "DELETE FROM orders WHERE order_id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, orderId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}