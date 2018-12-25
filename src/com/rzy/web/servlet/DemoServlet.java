package com.rzy.web.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //这里是处理方法，表示当访问URI为webapp1/demo/demo时，转到demo.jsp文件显示 
    req.getRequestDispatcher("/jsp/demo.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //这里在doPost方法里调用doGet方法，目的是无论表单以get方式传递还是post方式传递，处理方法都一致。
        doGet(req, resp);
    }

}
