<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/7/2024
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Customer List</title>
</head>
<body>
<h1>Customer List</h1>
<a href="customers/add">Add New Customer</a>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Address</th>
    <th>Actions</th>
  </tr>
  <c:forEach var="customer" items="${customers}">
    <tr>
      <td>${customer.customerId}</td>
      <td>${customer.name}</td>
      <td>${customer.phone}</td>
      <td>${customer.email}</td>
      <td>${customer.address}</td>
      <td>
        <a href="customers/edit?id=${customer.customerId}">Edit</a>
        <a href="customers/delete?id=${customer.customerId}" onclick="return confirm('Are you sure?')">Delete</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
