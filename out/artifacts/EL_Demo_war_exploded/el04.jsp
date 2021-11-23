<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 23/11/2021
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el expression details</title>
</head>
<body>
<% //pageContext.setAttribute("username", "zhangsan");
    request.setAttribute("username", "zhangsan");
    //session.setAttribute("username", "zhangsan");
    //application.setAttribute("username", "zhangsan");
%>
${username}

<%--JSP other 8 hindden object--%>

<%= request.getContextPath()%>
${pageContext.request.contextPath}
</body>
</html>
