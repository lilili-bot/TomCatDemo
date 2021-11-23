package com.itheima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/servletDemo01")
public class servletDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求的用户名
        String username = req.getParameter("username");
        // http session 获取对象
        HttpSession session = req.getSession(true);
        System.out.println(session);
        System.out.println(session.getId());
        //使用对象将用户名添加到共享数据中
        session.setAttribute("username", username);
        // 实现URL重新，相当于在地址栏拼接一个JsessionID
        resp.getWriter().write("<a href =' " + resp.encodeURL("http://localhost:8080/servletDemo03") + "'> Go servlet Demo 03 <a/>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
