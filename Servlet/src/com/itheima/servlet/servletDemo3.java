package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servletDemo3 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("接下来是servlet对象的生命周期的演示");
        System.out.println("对象初始化成功");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("对象在服务中");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet对象在服务中");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
