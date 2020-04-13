package com.company.prog.servlet;

import com.company.prog.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/person/edit")
public class PersonEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String age = req.getParameter("age");

        req.setAttribute("id", id);
        req.setAttribute("name", name);
        req.setAttribute("age", age);
        req.getRequestDispatcher("/personEditPage.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        new PersonService().editPerson(id, name, age);

        resp.sendRedirect("../person/list");



    }
}


