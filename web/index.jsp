<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2020/8/23
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table width="80%" align="center">
    <tr>
      <td>Id</td>
      <td>Name</td>
      <td>Pwd</td>
    </tr>
    <c:forEach items ="${users}" var="bean">
      <tr>
        <td>${bean.id}</td>
        <td>${bean.name}</td>
        <td>${bean.pwd}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
