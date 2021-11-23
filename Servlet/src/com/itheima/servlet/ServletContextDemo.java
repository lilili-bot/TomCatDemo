package com.itheima.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextDemo extends HttpServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // step 1. Get ServletContext Object. extends HttpServlet extends GenericServlet -> has a 成员变量
        ServletContext context = config.getServletContext();
        //
        String value = context.getInitParameter("globalDesc");
        System.out.println(value);
        // get abs path of the root path.
        String realPath = context.getRealPath("/");
        System.out.println(realPath);
        //1. src下的路径，是在"/WEB-INFO/classes"下的。

        // 共享数据
        context.setAttribute("username", "ZhangSan");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
