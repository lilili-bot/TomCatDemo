package com.itheima;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
请求转发，使用请求域，为不是应用域名。应用域是Servlet Context.
 */
@WebServlet("/ServletDemo09")
public class ServletDemo09 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置共享数据
        req.setAttribute("encoding", "gbk");
        //获取请求调度对象
        RequestDispatcher dispatcher = req.getRequestDispatcher("/ServletDemo10");
        //实现转发功能
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
