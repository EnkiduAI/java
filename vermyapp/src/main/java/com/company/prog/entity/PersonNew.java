package com.company.prog.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="new_table")


public class PersonNew {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private double age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonNew personNew = (PersonNew) o;
        return id == personNew.id &&
                Double.compare(personNew.age, age) == 0 &&
                Objects.equals(name, personNew.name);
    }

    public PersonNew() {
    }

    public PersonNew(int id, String name, double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);

    }
}