<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/7/2024
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h1 class="text-center mb-4">Order List</h1>

    <div class="mb-3 text-end">
        <a href="OrderController?action=create" class="btn btn-success">Add New Order</a>
    </div>

    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>Order ID</th>
            <th>Customer ID</th>
            <th>Book ID</th>
            <th>Order Date</th>
            <th>Return Date</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.customerId}</td>
                <td>${order.bookId}</td>
                <td>${order.orderDate}</td>
                <td>${order.returnDate}</td>
                <td>
                    <a href="OrderController?action=edit&id=${order.orderId}" class="btn btn-warning btn-sm">Edit</a>
                    <a href="OrderController?action=delete&id=${order.orderId}" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure you want to delete this order?');">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

