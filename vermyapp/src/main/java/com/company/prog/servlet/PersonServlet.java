package com.company.prog.servlet;

import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/person")
public class PersonServlet extends HttpServlet {
   @Override

      protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


       RequestDispatcher rd = req.getRequestDispatcher("/person.jsp");
        rd.forward(req,resp);


    }
}
