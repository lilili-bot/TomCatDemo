<%@ page import="com.itheima.bean.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 22/11/2021
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Info</title>
</head>
<body>
<table width="600" border="1px">
    <tr>
        <th>Student Name</th>
        <th>Student Age</th>
        <th>Student Score</th>
    </tr>
    <% ArrayList<Student> students = (ArrayList<Student>) session.getAttribute("Students");
        for (Student student : students) {%>
    <tr>
        <td>
            <%=student.getUsername()%>
        </td>
        <td>
            <%=student.getAge()%>
        </td>
        <td>
            <%=student.getScore()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
