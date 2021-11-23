package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
servlet 多映射
 */

public class servletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //定义一个商品金额。
        int money = 1000;
        //获取访问路径。
        String path = req.getRequestURI();
        path = path.substring(path.lastIndexOf("/"));
        //条件判断
        if ("/vip".equals(path)) {
            System.out.println("price for vip is " + (money * 0.9));
        } else if ("/vvip".equals(path)) {
            System.out.println("price for vip is " + (money * 0.5));
        } else {
            System.out.println("price for vip is " + money);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
