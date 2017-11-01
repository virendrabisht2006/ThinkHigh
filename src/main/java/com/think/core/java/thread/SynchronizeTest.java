package com.think.core.java.thread;

/**
 * Created by esha on 18/02/17.
 */
public class SynchronizeTest {
    public static void main(String[] args) {
        System.out.println("Statring hurreee...!!");

        Measure measure = new Measure();

        Measure measure1 = new Measure();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                measure.method1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                measure1.method2();
            }
        });

        t1.start();

        t2.start();
    }
}

class Measure{

    public synchronized void  method1(){
        System.out.println("Inside syncrinized method1");
        System.out.println(Thread.currentThread().getName()+" going to sleep");

        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done method1");
    }

    public synchronized void  method2(){
        System.out.println("Inside Synchornized static method");
        System.out.println(Thread.currentThread().getName()+" going to sleep");

        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("done method2");
    }
}