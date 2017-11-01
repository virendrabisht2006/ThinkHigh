package com.think.core.java.thread;

/**
 * Created by esha on 10/05/16.
 */
public class EvenOddTestUsingFlag {

    public static final int RANGE=20;
    public static  boolean oddFlag =true;
    private static int counter=1;
    public static void main(String ...args) {

        EvenOddTestUsingFlag evenOddTestUsingSemaphore = new EvenOddTestUsingFlag();

        Even even = evenOddTestUsingSemaphore.new Even();
        Odd odd = evenOddTestUsingSemaphore.new Odd();

        Thread t1 = new Thread(odd,"OddThread");
        Thread t2 = new Thread(even,"EvenThread");
        t1.start();
        t2.start();

    }

    class Even implements Runnable{

        @Override
        public void run() {
            try {
                while (counter <= RANGE) {
                    if (counter % 2 == 0 && (oddFlag==false)) {

                        System.out.println(Thread.currentThread().getName() + " : " + counter);

                        counter++;
                        oddFlag =true;
                        Thread.sleep(100);
                    }
                }
            }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    class Odd implements Runnable{

        @Override
        public void run() {
            try {

                while(counter <= RANGE) {
                    if (counter % 2 != 0 && (oddFlag ==true)) {

                        System.out.println(Thread.currentThread().getName() + " : " + counter);

                        counter++;
                        oddFlag = false;
                        Thread.sleep(100);
                    }
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



