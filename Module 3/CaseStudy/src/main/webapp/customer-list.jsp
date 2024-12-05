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
  <title>Title</title>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<br>
<table>
  <tr>
    <th>ID</th>
    <th>Ten</th>
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
    </tr>
  </c:forEach>
</table>

</body>
</html>
