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
import java.io.PrintWriter;

@WebServlet("/servletDemo1")
public class servletDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=GBK");
        /*
        1. 获得字节输出流对象
        2. 定义要输入的内容
        3.写出
        需要注意：写完后不需要关闭输出流，因为response对象会处理这个输出流。
         */
        /*
        ServletOutputStream ros = resp.getOutputStream();
        String str = "你好";
        ros.write(str.getBytes(
                //"UTF-8"
        ));
        //ros.close();
         */
        /*
        1. 获取字符输出流对象
        2.准备一个消息
        3.通过字符流输出
         */
        PrintWriter writer = resp.getWriter();
        String str = "hello";
        writer.write(str);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
