<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 22/11/2021
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/stu/loginStudentServlet" method="get" autocomplete="off">
    Name<input type="text" name="username">
    Password<input type="password" name="password">
    <button type="submit">Submit</button>
</form>
</body>
</html>
