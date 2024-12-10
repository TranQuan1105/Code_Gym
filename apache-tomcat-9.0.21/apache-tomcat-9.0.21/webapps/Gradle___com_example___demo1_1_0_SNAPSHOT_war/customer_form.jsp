<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/7/2024
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
</head>
<body>
<h1>${customer != null ? "Edit Customer" : "Add Customer"}</h1>
<form action="${customer != null ? 'customers/edit' : 'customers/add'}" method="post">
    <input type="hidden" name="id" value="${customer != null ? customer.customerId : ''}">
    <p>Name: <input type="text" name="name" value="${customer != null ? customer.name : ''}" required></p>
    <p>Phone: <input type="text" name="phone" value="${customer != null ? customer.phone : ''}" required></p>
    <p>Email: <input type="email" name="email" value="${customer != null ? customer.email : ''}" required></p>
    <p>Address: <input type="text" name="address" value="${customer != null ? customer.address : ''}" required></p>
    <p><input type="submit" value="${customer != null ? 'Update' : 'Add'}"></p>
</form>
<a href="customers">Back to list</a>
</body>
</html>
