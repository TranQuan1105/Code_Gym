<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/5/2024
  Time: 3:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Danh sách khách hàng</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body>
<h1>Danh sách khách hàng</h1>
<br>
<button type="button" class="btn btn-success" style="margin-left: 1350px">
  <a style="color: white; text-decoration: none"  href="/customer?action=show-create-form">Thêm mới</a>
</button>
<table class="table table-hover">
  <tr>
    <th>ID</th>
    <th>Tên</th>
    <th>SĐT</th>
    <th>Email</th>
    <th>Địa chỉ</th>
  </tr>
  <c:forEach items="${list}" var="s" varStatus="loop">
    <tr>
      <td>${loop.count}</td>
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

</body>
</html>
