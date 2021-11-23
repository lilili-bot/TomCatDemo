<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 22/11/2021
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$JSP$</title>
</head>
<body>
<h1>THIS IS MY FIRST JSP</h1>
<%--this will not show --%>
<%
    System.out.println("Hello, i am jsp");
    out.println("Hello JSP<br>");
    String str = "hello<br>";
    out.println(str);
%>
<%=
"Hallo"
%>
<%! String s = "abc";
%>
<%=s%>
<%!

    public void getSum() {
        System.out.println("getSum method");
    }%>

<%@include file="/include.jsp" %>
<%=str%>

</body>
</html>
