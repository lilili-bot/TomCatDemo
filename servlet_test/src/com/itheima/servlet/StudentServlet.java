package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 两步 首先获取前端的信息，并保存
        String name = req.getParameter("userName");
        String age = req.getParameter("age");
        String grade = req.getParameter("grade");
        final BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/lilycheng/Documents/TomCatDemo/servlet_test/stuInfo.txt"), true));
        bw.write(name + "---" + age + "---" + grade);
        bw.newLine();
        bw.close();
        // 第二步 保存结束，response信息给前端，信息保存完成。
        PrintWriter pw = resp.getWriter();
        pw.println("Saved Success.");
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
