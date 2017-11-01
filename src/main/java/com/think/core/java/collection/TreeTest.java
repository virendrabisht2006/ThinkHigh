package com.think.core.java.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by esha on 25/08/17.
 */
public class TreeTest {
    public static void main(String[] args) {

        Set<Student> studentSet = new TreeSet<>();

        Student student = new Student("Virendra",29);
        studentSet.add(student);

        student = new Student("Esha", 27);

        studentSet.add(student);

        student = new Student("Tanishq",2);

        studentSet.add(student);

        student = new Student("Esha", 28);

        studentSet.add(student);

        System.out.println(studentSet);

    }
}


class Student implements Comparable{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {

        Student s = (Student) o;

        if(this.getName().equals(((Student) o).getName())){
            return this.getAge() - (s.getAge());
        }
        else

        return this.getName().compareTo(s.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}