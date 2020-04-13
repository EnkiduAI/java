package com.company.prog.service;

import com.company.prog.dao.PersonDaoHibernate;
import com.company.prog.dao.PersonJDBCDao;
import com.company.prog.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PersonService {
    public static void addPerson(String name, String age) {
        int agePerson = Integer.parseInt(age);
        new PersonDaoHibernate().createPerson(name, agePerson);
    }

    public static ArrayList<Person> getPerson() {
        ArrayList<Person> list = new ArrayList<Person>();
        list = (ArrayList) new PersonDaoHibernate().getPerson();

        return list;
    }

    public static void editPerson(int id, String name, int age) {

        Person person = new Person(id, name, age);
        new PersonDaoHibernate().editPerson(person);

    }


    public void deletePerson(int id, String name, int age) {
        Person person = new Person(id, name, age);
        new PersonDaoHibernate().deletePerson(person);
    }
//    public static void main(String[] args) {
//        PersonDaoHibernate pdh = new PersonDaoHibernate();
//        pdh.createPerson();
//    }


}
