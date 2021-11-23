<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 22/11/2021
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Management HomePage</title>
</head>
<body>
<% Object username = session.getAttribute("name");
    if (username == null) {
%>
<a href="/stu/login.jsp">Please login.</a>
<%} else {%>
<a href="/stu/addStudent.jsp">Add Student</a>
<a href="/stu/listStudentServlet">Check Student</a>
<%}%>
</body>
</html>
