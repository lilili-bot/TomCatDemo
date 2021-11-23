package com.itheima.servlet;

import com.itheima.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet("/addStudentServlet")
public class addStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        String name = req.getParameter("StudentName");
        String age = req.getParameter("age");
        String score = req.getParameter("score");
        student.setUsername(name);
        student.setAge(Integer.parseInt(age));
        student.setScore(Integer.parseInt(score));
        // saving the data to local file.

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/lilycheng/Documents/TomCatDemo/Student_manager/student.txt", true));
        bw.write(student.getUsername() + ":" + student.getAge() + ":" + student.getScore());
        bw.newLine();
        bw.close();
        // 通过定时刷新功能，响应浏览器
        resp.getWriter().write("Success! Return to homepage in 3 seconds.");
        resp.setHeader("Refresh", "2;URL = /stu/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
