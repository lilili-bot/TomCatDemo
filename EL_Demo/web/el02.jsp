<%@ page import="com.itheima.bean.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: lilycheng
  Date: 23/11/2021
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el get different type of data.</title>
</head>
<body>
<% pageContext.setAttribute("num", 10);%>
basic data type ${num} <br>
<%
    Student stu = new Student("zhangsan", 23, 3);
    pageContext.setAttribute("stu", stu);
%>
${stu}<br>
${stu.username}<br>
${stu.age}<br>

<% String[] arr = {"Hello", "World"};
    pageContext.setAttribute("arr", arr);%>
${arr}<br>
${arr[0]} <br>

<% ArrayList<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    pageContext.setAttribute("list", list);
%>
${list}<br>
${list[0]}<br>

<% HashMap<String, Student> hm = new HashMap<>();
    hm.put("hm01", new Student("Zhangsan", 23, 1));
    pageContext.setAttribute("map", hm);
%>
${map}<br>
${map.hm01} <br>
${map.hm01.username} <br>
</body>
</html>
