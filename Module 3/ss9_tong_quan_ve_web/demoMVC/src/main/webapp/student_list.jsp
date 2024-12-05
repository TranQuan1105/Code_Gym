<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/3/2024
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách sinh viên</h1>
<br>
<a href="/student?action=show-create-form">Thêm mới sinh viên</a>
<br>
<a href="/student?action=show-update-form">Update sinh vien</a>
<table>
  <tr>
    <th>STT</th>
    <th>Ten</th>
    <th>Gioi tinh</th>
    <th>Diem</th>
  </tr>
  <c:forEach items="${list}" var="s" varStatus="loop" >
    <tr>
      <td>${loop.count}</td>
      <td>${s.name}</td>
      <td>${s.gender}</td>
      <td>${s.score}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
