package com.itheima;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletDemo07")
public class servletDemo07 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建字符流
        /*
        BufferedReader reader = req.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

         */
        //字节流
        ServletInputStream inputStream = req.getInputStream();
        byte[] arr = new byte[1024];
        int len;
        while ((len = inputStream.read(arr)) != -1) {
            System.out.println(new String(arr, 0, len));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
