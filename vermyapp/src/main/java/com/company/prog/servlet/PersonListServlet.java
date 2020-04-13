package com.company.prog.servlet;

import com.company.prog.entity.Person;
import com.company.prog.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;


@WebServlet("/person/list")
public class PersonListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ArrayList <Person> list  = new ArrayList<Person>();

        Connection connection = null;
        Statement statement = null;

        list = new PersonService().getPerson();

        req.setAttribute("personList",list);
        req.getRequestDispatcher("../personListPage.jsp").forward(req,resp);

    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ArrayList <Person> list  = new ArrayList<Person>();
//        list.add(new  Person("Alex", 31));
//        list.add(new Person("Dima", 20));
//
//        req.setAttribute("personList",list);
//        req.getRequestDispatcher("personListPage.jsp").forward(req,resp);
//
//    }
}
