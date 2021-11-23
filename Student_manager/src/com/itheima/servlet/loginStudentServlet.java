package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginStudentServlet")
public class loginStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名和密码
        String name = req.getParameter("username");
        //String password = req.getParameter("password");
        // 判断用户名
        if (name == null || " ".equals(name)) {
            //用户名为空，重新定向到登陆页面
            resp.sendRedirect("/stu/login.jsp");
            System.out.println(name);
            return;
            //用户名不为空，把用户名和密码存储到session会话域中
            //重新定向到index页面
        } else {
            System.out.println(name);
            HttpSession session = req.getSession();
            session.setAttribute("name", name); // 这里是给会话域的attribute定名字，要是JSP文件中的一致。
            //session.setAttribute("password", password);
            resp.sendRedirect("/stu/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
