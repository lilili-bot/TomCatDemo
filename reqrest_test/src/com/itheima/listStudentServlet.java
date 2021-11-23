package com.itheima;

import com.itheima.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/listStudentServlet")
public class listStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //现在本地找到学生数据
        BufferedReader br = new BufferedReader(new FileReader("/Users/lilycheng/Documents/TomCatDemo/reqrest_test/student.txt"));
        // 创建集合对象，用于保存student对象
        ArrayList<Student> studentsArr = new ArrayList<Student>();
        //循环读取文件中的数据，将数据封装到student对象中，再把多个学生对象添加到集合中。
        //使用响应，将找到的信息给相应的参数赋值

        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(":");
            Student student = new Student();
            student.setUsername(arr[0]);
            student.setAge(Integer.parseInt(arr[1]));
            student.setScore(Integer.parseInt(arr[2]));
            studentsArr.add(student);
        }
        //使用相应输出流，将信息响应给浏览器
        PrintWriter pw = resp.getWriter();
        for (Student student : studentsArr) {
            pw.write(student.getUsername() + ":" + student.getAge() + ":" + student.getScore());
            pw.write("/r");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
