package com.rzy.web.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
      String name = req.getParameter("name");
      String pwd  = req.getParameter("pwd");
    
      req.setAttribute("name",name);
      req.setAttribute("pwd", pwd);
      
      req.getRequestDispatcher("/jsp/result.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}