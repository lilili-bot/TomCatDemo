package com.itheima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
请求转发，使用请求域，为不是应用域名。应用域是Servlet Context.
 */
@WebServlet("/ServletDemo10")
public class ServletDemo10 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从另外一个servlet，得到共享数据。
        Object reqAttribute = req.getAttribute("encoding");
        //输出一个共享数据
        System.out.println(reqAttribute);
        System.out.println("Servlet Demo 10 being ran.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
