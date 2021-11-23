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
@WebServlet("/ServletDemo11")
public class ServletDemo11 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet Demo 11 being ran.");
        RequestDispatcher rD = req.getRequestDispatcher("/ServletDemo12");
        System.out.println(rD);
        rD.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
