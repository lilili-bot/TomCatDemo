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

@WebServlet("/servletDemo7")
public class servletDemo7 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到发布项目后的资源真实路径
        String realPath = getServletContext().getRealPath("img/hangon.gif");
        //响应对象实现字节输入流
        BufferedInputStream is = new BufferedInputStream(new FileInputStream(realPath));
        //设置响应头的支持类型。
        resp.setHeader("Content-Type", //消息头的名称，代表我们所支持的类型。
                "application/octet-stream" //消息头参数，应用的类型为字节流
        );
        // 设置响应消息头，告诉server以下载的方式打开附件
        resp.setHeader(
                "Content-Disposition",// 消息头的名称：代表处理的形式
                "attachment;filename=hm.png" //消息头的参数：代表以附件的形式处理
        );
        //响应得到字节输出流对象
        ServletOutputStream respOutputStream = resp.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read()) != -1) {
            respOutputStream.write(bytes, 0, len);
        }
        // 关闭输入流对象，因为是我们自己new出来的。
        is.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
