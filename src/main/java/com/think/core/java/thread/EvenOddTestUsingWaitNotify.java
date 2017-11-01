package com.think.core.java.thread;


/**
 * Created by esha on 10/05/16.
 */
public class EvenOddTestUsingWaitNotify {

    public static final int RANGE = 20;

    public static void main(String[] args) {
        EvenOddTestUsingWaitNotify e1= new EvenOddTestUsingWaitNotify();
        Thread t1= new Thread(e1.new EvenNo(),"EvenThread");
        Thread t2= new Thread(e1.new OddNo(),"OddThread");
        t2.start();
        t1.start();
    }

    public class EvenNo implements Runnable {

        @Override
        public void run() {
            try {
                while (SharedNum.number <= RANGE) {
                    synchronized (SharedNum.class) {
                        if (SharedNum.number % 2 == 0) {
                            System.out.println(Thread.currentThread().getName()+" : "+SharedNum.number);
                            SharedNum.number++;
                            SharedNum.class.notifyAll();
                        }
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public class OddNo implements Runnable {

        @Override
        public void run() {
            try {
                while (SharedNum.number <= RANGE) {
                    synchronized (SharedNum.class) {
                        if (SharedNum.number % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + " : " + SharedNum.number);
                            SharedNum.number++;
                            SharedNum.class.wait();
                        }

                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
    class SharedNum {
        public static int number = 1;
    }
