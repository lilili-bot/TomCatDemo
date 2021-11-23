package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class servletDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("userName");
        String age = req.getParameter("age");
        String[] grades = req.getParameterValues("grade");

        System.out.println(parameter);
        System.out.println(age);
        System.out.println(grades);

        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String element = parameterNames.nextElement();
            System.out.println(element);
        }

        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            String[] values = map.get(key);
            System.out.println(key + ":" + values);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
