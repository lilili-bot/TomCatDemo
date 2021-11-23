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

@WebServlet("/servletDemo3")
public class servletDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String news = "This is a breaking news";
        resp.setContentType("text/html: charset=UTF-8");

// set buffer time, meaning instead of server responses, saving it in buffer.
        //
        resp.setDateHeader("Expires", // expires resources from the buffer.
                System.currentTimeMillis() + 1 * 60 * 60 * 1000 // the time of user visiting his news + 1 hour. ms.
        );
        //ros.close();
        resp.getWriter().write(news);
        System.out.println("aaa");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
