<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/9/2024
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Management System</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header class="bg-dark text-white py-4 text-center">
    <h1>Library Management</h1>
</header>

<div class="container mt-5">
    <div class="row text-center">
        <div class="col-md-4 mb-4">
            <div class="card h-100">
                <div class="card-body">
                    <h5 class="card-title">Manage Customers</h5>
                    <a href="customers?action=show-customer-list" class="btn btn-primary">Go to Customers</a>
                </div>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card h-100">
                <div class="card-body">
                    <h5 class="card-title">View Books</h5>
                    <a href="library?action=show-books-list" class="btn btn-success">Go to Books</a>
                </div>
            </div>
        </div>

        <!-- Borrow/Return Books -->
        <div class="col-md-4 mb-4">
            <div class="card h-100">
                <div class="card-body">
                    <h5 class="card-title">Borrow/Return Books</h5>
                    <a href="library?action=orders" class="btn btn-warning">Go to Borrow/Return</a>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container mt-5">
    <div class="row">
        <!-- Book Card 1 -->
        <div class="col-md-3 mb-4 d-flex">
            <div class="card h-100">
                <img src="WEB-INF/img/To-kill-a-mockingbird.jpg" class="card-img-top" alt="To Kill a Mockingbird">
                <div class="card-body">
                    <h5 class="card-title">To Kill a Mockingbird</h5>
                    <p class="card-text">To Kill a Mockingbird kể về Atticus Finch, một luật sư ở miền Nam nước Mỹ, bảo vệ Tom Robinson...</p>
                    <span class="badge bg-primary">Fiction</span>
                    <span class="badge bg-secondary">Classic</span>
                </div>
                <div class="card-footer text-center">
                    <button href="library?action=show-books-list" class="btn btn-success">Mượn Sách</button>
                </div>
            </div>
        </div>

        <!-- Book Card 2 -->
        <div class="col-md-3 mb-4 d-flex">
            <div class="card h-100">
                <img src="placeholder.jpg" class="card-img-top" alt="1984">
                <div class="card-body">
                    <h5 class="card-title">1984</h5>
                    <p class="card-text">1984 của George Orwell là câu chuyện về Winston Smith, một người sống dưới chế độ toàn trị...</p>
                    <span class="badge bg-danger">Dystopian</span>
                    <span class="badge bg-secondary">Classic</span>
                </div>
                <div class="card-footer text-center">
                    <button href="library?action=show-books-list" class="btn btn-success">Mượn Sách</button>
                </div>
            </div>
        </div>

        <!-- Book Card 3 -->
        <div class="col-md-3 mb-4 d-flex">
            <div class="card h-100">
                <img src="placeholder.jpg" class="card-img-top" alt="Pride and Prejudice">
                <div class="card-body">
                    <h5 class="card-title">Pride and Prejudice</h5>
                    <p class="card-text">Pride and Prejudice của Jane Austen kể về Elizabeth Bennet, một cô gái thông minh...</p>
                    <span class="badge bg-info text-dark">Romance</span>
                    <span class="badge bg-secondary">Classic</span>
                </div>
                <div class="card-footer text-center">
                    <button href="library?action=show-books-list" class="btn btn-success">Mượn Sách</button>
                </div>
            </div>
        </div>

        <!-- Book Card 4 -->
        <div class="col-md-3 mb-4 d-flex">
            <div class="card h-100">
                <img src="placeholder.jpg" class="card-img-top" alt="The Great Gatsby">
                <div class="card-body">
                    <h5 class="card-title">The Great Gatsby</h5>
                    <p class="card-text">The Great Gatsby của F. Scott Fitzgerald kể về Jay Gatsby, một triệu phú bí ẩn...</p>
                    <span class="badge bg-primary">Fiction</span>
                    <span class="badge bg-secondary">Classic</span>
                </div>
                <div class="card-footer text-center">
                    <button href="library?action=show-books-list" class="btn btn-success">Mượn Sách</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
