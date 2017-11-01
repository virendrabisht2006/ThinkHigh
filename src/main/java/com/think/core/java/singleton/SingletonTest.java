package com.think.core.java.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * Created by esha on 19/08/17.
 */
public class SingletonTest {

    public SingletonTest() throws CloneNotSupportedException {
    }

    public static void main(String[] args) throws Exception {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        //break singleton in case of serilization
        File file = new File("test.text");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(singleton1);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            singleton2 = (Singleton) ois.readObject();
        }
        System.out.println("After serialiation");
        System.out.println(singleton1.hashCode()+" = "+singleton2.hashCode());

        //break singleton with reflection

        Singleton s = Singleton.getInstance();
        Singleton s1 = null;
        Constructor [] constructor =  Singleton.class.getDeclaredConstructors();
        try {
            for (Constructor c : constructor) {
                c.setAccessible(true);
                s1 = (Singleton) c.newInstance();
               // break;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("after reflection");
        System.out.println(s1.hashCode()+" = "+ s.hashCode());

        //break singleton with clone
        /* Singleton s3 = Singleton.getInstance();
         Singleton s4 = (Singleton) s.clone();

        System.out.println(s3.hashCode()+" = "+ s4.hashCode());*/


        }



    }


class Singleton implements Cloneable, Serializable{

    private Singleton(){
        if(SingletonLoader.instance !=null){
            throw new IllegalStateException("Object already created, can not create another one!");
        }
        System.out.println("object created !");
    }

    static class  SingletonLoader{
        public static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonLoader.instance;
    }

   /* @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

  /*  protected Object readResolve(){
        return SingletonLoader.instance;
    }*/
}
