package com.company.prog.dao;


import com.company.prog.entity.Person;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import javax.xml.ws.Service;


public class PersonDaoHibernate {
    static Session session;
    static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        ServiceRegistry servReg = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties())
                .build();


        sessionFactory = conf.buildSessionFactory(servReg);
        sessionFactory = conf.buildSessionFactory();
        return sessionFactory;
    }

    public static void createPerson(String name, int age) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            Person person = new Person(name, age);

            session.save(person);
            session.getTransaction().commit();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<Person> getPerson() {
        session = buildSessionFactory().openSession();
        session.beginTransaction();
        List<Person> people = (List<Person>) session.createQuery("from Person").list();
        return people;
    }

    public static void deletePerson(Person person) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            session.delete(person);
            session.getTransaction().commit();
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }


    }

    public static void editPerson(Person person) {
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            session.update(person);
            session.getTransaction().commit();
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}