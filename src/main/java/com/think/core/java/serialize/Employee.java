package com.think.core.java.serialize;

import java.io.Serializable;

/**
 * Created by esha on 19/01/17.
 */
public class Employee implements Serializable {

    private static final Long serialId= 1L;

    private String name;

    private static int age=25;

    private transient int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
