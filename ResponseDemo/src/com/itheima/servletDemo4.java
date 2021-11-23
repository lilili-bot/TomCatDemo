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

@WebServlet("/servletDemo4")
public class servletDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "Password is wrong, 3s later will return to page.";
        // set charset.
        resp.setContentType("text/html; charset = UTF-8");
        // write message
        resp.getWriter().write(str);
        // set update
        resp.setHeader("Refresh", "3;URL=/login.html");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
