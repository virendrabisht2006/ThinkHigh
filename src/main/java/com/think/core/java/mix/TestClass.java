package com.think.core.java.mix;

/**
 * Created by esha on 10/06/16.
 */
public class TestClass {
    public static void main(String[] args) {
        String s1="Virendra";
        System.out.println( s1.charAt(s1.length()-1));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("1 " + Thread.currentThread().isAlive());
                    try {
                        System.out.println(Thread.currentThread().getName()+" going to slepp.");
                        Thread.sleep(1000*60*2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        },"TestTread");
        long t1= System.currentTimeMillis();
        thread.start();
        System.out.println(Thread.currentThread().getName()+" going to slepp.");
        try {
            Thread.currentThread().sleep(1000*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("About to interupt thread..");
        thread.interrupt();
        System.out.println("2 " + thread.isAlive());

        System.out.println(Thread.currentThread().getName()+" completed");
        long t2= System.currentTimeMillis();
        System.out.println("Total Time Taken: "+(t2-t1)/60000);
    }
}
