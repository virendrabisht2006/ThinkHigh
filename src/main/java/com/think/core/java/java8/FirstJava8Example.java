package com.think.core.java.java8;

/**
 * Created by esha on 10/07/17.
 */
public class FirstJava8Example {

    public static void main(String[] args) {

        Runnable runnable =() -> System.out.println("Welcome to first lamda");

        new Thread(runnable).start();
    }
}
