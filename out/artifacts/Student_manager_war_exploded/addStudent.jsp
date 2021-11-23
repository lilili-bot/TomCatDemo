<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 22/11/2021
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<form action="/stu/addStudentServlet" method="get" autocomplete="off">
    StudentName<input type="text" name="StudentName">
    age<input type="number" name="age">
    score<input type="number" name="score">
    <button type="submit">Submit</button>
</form>
</body>
</html>
