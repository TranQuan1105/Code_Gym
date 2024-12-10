<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/9/2024
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<h1>Book List</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Category</th>
        <th>Total Copies</th>
        <th>Available Copies</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.category}</td>
            <td>${book.copiesAmount}</td>
            <td>${book.availableCopies}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

