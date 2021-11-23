package com.itheima.servlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

/*
这个类是实现了一个接口，用来注册配置SERVLET的功能类。
 */
public class myRegister implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
// 完成SERVLET的创建和配置。
        // 1. create instance of the servlet object.
        servletDemo02 sd = new servletDemo02();

        // 2. ServletContext Object, add Servlet, and get Servlet dynamic config object.
        final ServletRegistration.Dynamic sdRegistration = servletContext.addServlet("ServletDemo02", sd);// 第一个参数是名字，第二个参数是servlet的实现对象

        //3. config servlet.
        sdRegistration.addMapping("/servletDemo02"); // mapping url.
        sdRegistration.setLoadOnStartup(1); // servlet的创建时机。1 表示在服务器加载的时候创建，-1表示在初始化的时候创建。
    }
}
