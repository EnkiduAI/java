package com.company.prog.dao;

import com.company.prog.entity.Person;

import java.sql.*;
import java.util.ArrayList;

public class PersonJDBCDao {

    public void createPerson(String name, int age) {

        Connection connection = null;
        Statement statement = null;

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection("jdbc:mysql://localhost/new_schema?serverTimezone=UTC", "root", "root");
            statement = connection.createStatement();
            String sql = "INSERT INTO new_table (name, age) values ('" + name + "'," + age +")";
            try {
                statement.execute(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Person> getPersonDao() {
        ArrayList<Person> list = new ArrayList<Person>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection("jdbc:mysql://localhost/new_schema?serverTimezone=UTC", "root", "root");
            String sql = "SELECT * FROM new_table";
            statement = connection.prepareStatement(sql);


            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Person person = new Person(id, name, age);
                list.add(person);
            }

            try {
                statement.execute(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void editPerson(Person person) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection("jdbc:mysql://localhost/new_schema?serverTimezone=UTC", "root", "root");

            String sql = "UPDATE new_table SET name=?, age=? WHERE id=?";


            statement = connection.prepareStatement(sql);
            statement.setString(1, person.getName());
            statement.setInt(2, person.getAge());
            statement.setInt(3, person.getId());

            try {
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deletePerson(Person person) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection("jdbc:mysql://localhost/new_schema?serverTimezone=UTC", "root", "root");

            String sql = "DELETE FROM new_table WHERE id=?";


            statement = connection.prepareStatement(sql);
            /*statement.setString(1, person.getName());
            statement.setInt(2, person.getAge());*/
            statement.setInt(1, person.getId());

            try {
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
