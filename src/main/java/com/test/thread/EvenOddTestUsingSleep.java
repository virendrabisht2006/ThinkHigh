package com.test.thread;

import static java.lang.Thread.*;

/**
 * Created by esha on 10/05/16.
 */
public class EvenOddTestUsingSleep {
    private static int num=20;
    public static void main(String[] args) {

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=num;i++){
                    if(i%2==0) {
                        System.out.println(Thread.currentThread().getName()+" : "+ i);
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"EvenThread");

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=num;i++){
                    if(i%2!=0) {
                        System.out.println(Thread.currentThread().getName()+" : "+ i);
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } ,"OddThread");
        t1.start();
        t2.start();

    }


}
