<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/9/2024
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header class="bg-dark text-white py-4 text-center">
    <h1>Customer List</h1>
    <p>Manage the customers of the library</p>
</header>

<div class="container mt-5">
    <a href="index.jsp" class="btn btn-secondary mb-3">Back to Home</a>
    <a href="customers?action=addCustomer-form" class="btn btn-primary mb-3">Add New Customer</a>

    <table class="table table-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
        </tr>

        <c:forEach items="${customers}" var="s" varStatus="loop">
            <tr>
                <td>${s.customerId}</td>
                <td>${s.name}</td>
                <td>${s.phone}</td>
                <td>${s.email}</td>
                <td>${s.address}</td>
                <td>
                    <button type="button" class="btn btn-warning">
                        <a style="color: white; text-decoration: none" href="">Sửa</a>
                    </button>
                    <button type="button" class="btn btn-danger">
                        <a style="color: white; text-decoration: none" href="">Xóa</a>
                    </button>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
