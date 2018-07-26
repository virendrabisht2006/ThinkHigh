package com.think.core.java.collection;

/**
 * Created by esha on 22/05/18.
 */
public class MyThread extends Thread {

    MyThread() {
        System.out.println("consu");
    }

    public static void main(String[] args) {
        Thread t = new MyThread() {
            public void run() {
                System.out.println("Inside");
            }
        };
        t.start();
    }

    public void run() {
        System.out.println("run");
    }
}
