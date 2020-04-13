package com.company.prog.servlet;

import com.company.prog.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/person/delete")
public class PersonDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int id= Integer.parseInt(req.getParameter("id"));
        String name =req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));

        req.setAttribute("id", id);
        req.setAttribute("name", name);
        req.setAttribute("age", age);
        req.getRequestDispatcher("/personDelete.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        new PersonService().deletePerson(id, name, age);
        resp.sendRedirect("../person/list");
    }
}
