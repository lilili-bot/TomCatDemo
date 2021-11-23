package com.itheima;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieDemo1")
public class cookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过响应对象写出提示信息
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("Welcome to website, your last visit time is : <br>");
        //创建cookie对象，用于记录最后的访问时间
        Cookie cookie = new Cookie("firstCookie_time", System.currentTimeMillis() + "");
        // 设置cookie的最大存活时间
        cookie.setMaxAge(1 * 60 * 60 * 100); // s
        //cookie.setMaxAge(0); //默认值是-1， 即为在当前会话下有效。
        //将cookie对象添加到客户端
        resp.addCookie(cookie);
        //
        Cookie[] cookiesArr = req.getCookies();
        for (Cookie cookie1 : cookiesArr) {
            if ("firstCookie_time".equals(cookie1.getName())) {
                //获取cookie中的value
                String value = cookie1.getValue();
                System.out.println(value);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                writer.write(sdf.format(new Date(Long.parseLong(value))));
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
