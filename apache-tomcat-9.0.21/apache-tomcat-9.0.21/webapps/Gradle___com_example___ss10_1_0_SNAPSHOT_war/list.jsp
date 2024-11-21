<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 28/8/2023
  Time: 8:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <thead>
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Giới tính</th>
        <th>Điểm</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="s" items="${list}" varStatus="hai">
        <tr>
            <td><c:out value="${hai.count}"/></td>
            <td><c:out value="${s.name}"/></td>
            <td><c:out value="${s.gender}"/></td>
            <td><c:out value="${s.point}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
