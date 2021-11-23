<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 23/11/2021
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL expression</title>
</head>
<body>
<%--
向域对象添加数据
--%>
<% request.setAttribute("username","zhangsan");%>

Java Code<% out.print(request.getAttribute("username")); %>

JSP Expression<%= request.getAttribute("username")%>

EL expression ${username}

</body>
</html>
