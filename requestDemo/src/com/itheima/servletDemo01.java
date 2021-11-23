package com.itheima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servletDemo01")
public class servletDemo01 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        //获取虚拟目录名称
        String path = req.getContextPath();
        //获取servlet映射路径 mapping url
        String uri = req.getServletPath();
        // get 访问者的 ip address
        String ip = req.getRemoteAddr();
        // get 请求的信息的数据
        String queryString = req.getQueryString();
        // 获得统一资源标识符, 虚拟目录和servlet访问的路径加载一起： /servletDemo01 范围更大 共和国
        String requestURI = req.getRequestURI();
        // 获得统一资源定位符， 完成的访问路径 ：http://localhost:8080/servletDemo01  范围小一些 中华人民共和国
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(path + "-" + uri + "-" + ip + "-" + queryString + "-" + requestURI + "-" + requestURL);

         */

        //根据请求头名称获取一个值
        String connection = req.getHeader("connection");
        //根据请求头，获取多个请求头的值
        Enumeration<String> headers = req.getHeaders("accept-encoding");
        while (headers.hasMoreElements()) {
            String element = headers.nextElement();
            System.out.println(element);
        }
        //获取所有的请求头，根据请求头的名称，获取所有的值
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            System.out.println(s);
            String header = req.getHeader(s);
            System.out.println(header);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
