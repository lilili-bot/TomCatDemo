package com.itheima.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
获取表单中的内容,并在servlet中展示出来
账号
密码
姓名
性别 男 女
注册
servlet config中常用的方法。
 */
public class servletDemo5<servletConfig> extends HttpServlet {

    private ServletConfig servletConfig;

    // 通过初始化的方法给config赋值。因为config是在servlet初始化的时候完成的
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get value through key. 
        String encodingValue = servletConfig.getInitParameter("encoding");
        // get all the keys
        Enumeration<String> keys = servletConfig.getInitParameterNames();
        while (keys.hasMoreElements()) {
            // get every key.
            String key = keys.nextElement();
            String keyValue = servletConfig.getInitParameter(key);
            System.out.println(key + ":" + keyValue);
        }

        // get servlet name
        String servletName = servletConfig.getServletName();
        System.out.println(servletName);
        // get servletContext object.
        ServletContext servletContent = servletConfig.getServletContext();
        System.out.println(servletContent);

        //
        Object value = servletContent.getAttribute("username");
        System.out.println(value);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
