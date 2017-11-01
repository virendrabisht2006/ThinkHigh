package com.think.core.java.serialize;

import java.io.*;

/**
 * Created by esha on 19/01/17.
 */
public class SerializeTest {
    public static void main(String[] args) throws Exception{
        File file = new File("emp.ser");

        Employee employee = new Employee("Virendra", 30,  150000000);

        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //oos.write(employee);
        oos.writeObject(employee);


        Employee employee2 = new Employee("Jyoti", 27,  17000);

        oos.writeObject(employee2);


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Employee employee1 = (Employee) ois.readObject();

        System.out.println(employee1);

        employee1 = (Employee) ois.readObject();

        System.out.println(employee1);

    }
}
