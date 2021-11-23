package com.itheima;
/*
Response outputStream Demo
 */

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/servletDemo2")
public class servletDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=GBK");
        /*
        1. 因为我们是通过tomcat发布到网络中，因袭需要通过servletcontext来获取发布后的真实路径
        2. 获得缓冲搞笑输入流
        2. 通过响应对象获得字节输出流对象
        3. 定义要输入的内容
        4.写出
        需要注意：写完后不需要关闭输出流，因为response对象会处理这个输出流。
         */
        String realPath = getServletContext().getRealPath("img/hangon.gif");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));

        ServletOutputStream ros = resp.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {
            ros.write(bytes, 0, len);
        }


        //ros.close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
