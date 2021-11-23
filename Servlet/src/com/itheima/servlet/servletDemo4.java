package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*

 */
public class servletDemo4 extends HttpServlet {
    // 定义一个用户名成员变量
    private String userName;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 使用request获取用户名
        // 定义局部变量，避免线程不安全。
        //String userName = null;

        synchronized (this) {
            userName = req.getParameter("userName");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 将用户名响应给浏览器
        PrintWriter pw = resp.getWriter();
        pw.println("Welcome" + userName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
