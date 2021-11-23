package com.itheima;
/*
Response outputStream Demo
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletDemo5")
public class servletDemo5 extends HttpServlet {

    /*
    请求重定向注意：不能使用共享数据，而且是两次执行。
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo5 is ran.");
        req.setAttribute("username", "zhangsan");
        //resp.sendRedirect(req.getContextPath() + "/servletDemo6");
        resp.sendRedirect("https://www.google.com/");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
