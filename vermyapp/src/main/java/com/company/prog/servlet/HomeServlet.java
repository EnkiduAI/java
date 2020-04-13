package com.company.prog.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homePage")
public class HomeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = "Hello everybody";
        req.setAttribute("data", text);
        RequestDispatcher rd = req.getRequestDispatcher("homePage.jsp");
        rd.forward(req, resp);
    }
}
