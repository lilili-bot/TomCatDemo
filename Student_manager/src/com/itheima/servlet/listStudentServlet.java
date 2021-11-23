package com.itheima.servlet;

import com.itheima.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/listStudentServlet")
public class listStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建本地字符流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/Users/lilycheng/Documents/TomCatDemo/Student_manager/student.txt")));
        //创建集合对象，用于保存student对象
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split(":");
            Student student = new Student();
            student.setUsername(strings[0]);
            student.setAge(Integer.parseInt(strings[1]));
            student.setScore(Integer.parseInt(strings[2]));
            //读取文件并用student对象封装，并添加到集合中
            studentArrayList.add(student);
        }
        //读取本地数据，存放到会话域中
        HttpSession session = req.getSession();
        session.setAttribute("Students", studentArrayList);
        //重定向到学生列表页面
        resp.sendRedirect("/stu/listStudent.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
