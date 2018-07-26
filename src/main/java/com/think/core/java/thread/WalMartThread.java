package com.think.core.java.thread;

/**
 * Created by esha on 16/05/18.
 */

/*
create a method which will except the noOfThread and maxNumber
code should create same number of thread and print number
supose noOfThread: 3 and maxNumber: 11
so first thread should print-> 1 4 7 10
2nd thread should print -> 2 5 8 11
3rd thread should print -> 3 6 9

But they should execute one by one and final output should be-> 1,2,3,4,6,6,7,8,9,10,11
 */
public class WalMartThread {

    public static void main(String[] args) {
        System.out.println("Lets start");
        printNumber(3, 11);

    }

    private static void printNumber(int totalThread, int maxNumber) {

        for (int i = 1; i <= totalThread; i++) {
            Thread t = new Thread(new Printer(maxNumber, totalThread, i), "Thread -" + i);
            t.start();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (SharedNumber.class) {
            SharedNumber.class.notifyAll();
        }
    }


}

class Printer implements Runnable {
    static volatile boolean firstTime = true;
    int maxNumber;
    int totalThread;
    int printCount;


    public Printer(int maxNumber, int totalThread, int threadNumber) {
        this.maxNumber = maxNumber;
        this.totalThread = totalThread;
        this.printCount = threadNumber;
    }

    @Override
    public void run() {
        while (printCount <= maxNumber) {

            // }
            // synchronized (SharedNumber.class) {
            System.out.println("Current Running thread: " + Thread.currentThread().getName() + " : " + printCount);
            printCount = printCount + totalThread;
            SharedNumber.number++;

            synchronized (SharedNumber.class) {
                //    System.out.println("SharedNumber.number: "+SharedNumber.number+", and totalThread: "+totalThread);
                if (firstTime == false || SharedNumber.number == totalThread) {
                    SharedNumber.number = 0;
                    firstTime = false;
                    //  System.out.println(Thread.currentThread().getName()+", About to notify other thread: ");
                    SharedNumber.class.notify();

                }

                try {
                    //System.out.println("Waiting: "+Thread.currentThread().getName()+", sharedCounter: "+ SharedNumber.number);
                    SharedNumber.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SharedNumber {
    public static int number = 0;
}