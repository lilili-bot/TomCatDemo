package com.itheima;

import com.itheima.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

@WebServlet("/servletDemo05")
public class servletDemo05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取所有信息，以键值对信息
        Map<String, String[]> map = req.getParameterMap();
        //创建学生对象
        Student student = new Student();
        //遍历map
        for (String name : map.keySet()) {
            String[] value = map.get(name);
            // 给学生对象封装对象。
            // get student 对象的属性描述器。
            try {
                PropertyDescriptor pDesc = new PropertyDescriptor(name, student.getClass()); // 拿到成员变量name的get和set方法
                Method writeMethod = pDesc.getWriteMethod();
                if (value.length > 1) {
                    writeMethod.invoke(student, (Object) value);
                } else {
                    writeMethod.invoke(student, value);
                }

            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println(student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
