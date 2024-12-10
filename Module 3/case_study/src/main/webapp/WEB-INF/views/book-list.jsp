<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/9/2024
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book List</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header class="bg-dark text-white py-4 text-center">
    <h1>Book List</h1>
    <p>Browse the library's collection</p>
</header>

<div class="container mt-5">
    <a href="index.jsp" class="btn btn-secondary mb-3">Back to Home</a>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>#</th>
            <th>Title</th>
            <th>Author</th>
            <th>Category</th>
            <th>Available Copies</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>1</td>
            <td>Book Title 1</td>
            <td>Author Name</td>
            <td>Fiction</td>
            <td>5</td>
            <td>
                <a href="borrowBook.jsp?bookId=1" class="btn btn-warning">Borrow</a>
            </td>
        </tr>

        </tbody>
    </table>
</div>

</body>
</html>