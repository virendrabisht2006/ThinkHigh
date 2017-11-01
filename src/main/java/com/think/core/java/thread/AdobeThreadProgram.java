package com.think.core.java.thread;

/**
 * Created by esha on 02/10/16.
 */
public class AdobeThreadProgram {
    private static boolean isSuspended = false;

    public static void main(String[] args) throws Exception {
        System.out.println("Starting main thread..");

        Thread t1 = new Thread(new MyTask());
        t1.start();

        Thread.sleep(5000L);

        isSuspended = true;

        System.out.println("About to join...");

        t1.join();

    }

    private static class MyTask implements Runnable{

        @Override
        public void run() {
            while (!isSuspended){
                System.out.println(Thread.currentThread().getName()+" Thread running..");
                //time cosuming task
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
