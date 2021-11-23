<%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 23/11/2021
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL compare</title>
</head>
<body>
<%
    String str = null;
    String str2 = "";
    int[] arr = {};
%>

${empty str} <br>
${empty str2} <br>
${empty arr} <br>

<% pageContext.setAttribute("gender", "woman");%>
<input type="radio" name="gender" value="man" ${gender == "man"?"checked":""}> Male
<input type="radio" name="gender" value="woman"${gender == "woman"?"checked":""}> Female
</body>
</html>
