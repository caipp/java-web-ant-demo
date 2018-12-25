package com.rzy.web.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //通过name属性获取请求的参数
      String name = req.getParameter("name");
      String pwd  = req.getParameter("pwd");
    //通过setAttribute才能将获取的参数传递出去，转到jsp处理
      req.setAttribute("name",name);
      req.setAttribute("pwd", pwd);
    //这里是处理方法，表示当访问URI为webapp1/demo/result时，转到result.jsp文件显示  
      req.getRequestDispatcher("/jsp/result.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}