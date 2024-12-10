<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/7/2024
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Book Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
  <h1 class="text-center mb-4">Book Form</h1>
  <form action="BookController" method="post">
    <div class="mb-3">
      <label for="bookId" class="form-label">Book ID</label>
      <input type="text" class="form-control" id="bookId" name="bookId" value="${book.bookId}" readonly>
    </div>
    <div class="mb-3">
      <label for="title" class="form-label">Title</label>
      <input type="text" class="form-control" id="title" name="title" value="${book.title}" required>
    </div>
    <div class="mb-3">
      <label for="author" class="form-label">Author</label>
      <input type="text" class="form-control" id="author" name="author" value="${book.author}" required>
    </div>
    <div class="mb-3">
      <label for="genre" class="form-label">Genre</label>
      <input type="text" class="form-control" id="genre" name="genre" value="${book.genre}" required>
    </div>
    <div class="mb-3">
      <label for="availableCopies" class="form-label">Available Copies</label>
      <input type="number" class="form-control" id="availableCopies" name="availableCopies" value="${book.availableCopies}" required>
    </div>
    <div class="text-center">
      <button type="submit" class="btn btn-primary">Save</button>
      <a href="book.jsp" class="btn btn-secondary">Cancel</a>
    </div>
  </form>
</div>

</body>
</html>

