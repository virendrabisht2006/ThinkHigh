package com.think.core.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by esha on 14/06/16.
 */
public class ExecutorServiceTest {
    public static void main(String[] args) {
        long t1= System.currentTimeMillis();
        System.out.println("Excited to see..");
        ExecutorServiceTest executorServiceTest = new ExecutorServiceTest();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Integer> integerList = new CopyOnWriteArrayList<>();
        List<Callable<Integer>> callableList = new ArrayList<>();

        for (int i = 100; i <= 500; i = i + 100) {
            callableList.add(executorServiceTest.new Sleeper(i * 60));
            // callableList.add(executorServiceTest.new Sleeper(1000 * 60));
        }


        try {
            List<Future<Integer>> futureList = executorService.invokeAll(callableList);
            for(Future<Integer> future: futureList){
                integerList.add(future.get());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e){
            e.printStackTrace();
        }

        for(Integer i:integerList){
            System.out.println("Sleep Time: "+i);
        }
        long t2 = System.currentTimeMillis();
        executorService.shutdown();
        System.out.println("Total Time Taken: " + (t2 - t1) / 1000 + " sec");
    }

    class Sleeper implements Callable<Integer> {
        private int sleepTime;
        Sleeper(int sleepTime){
            this.sleepTime = sleepTime;
        }
        @Override
        public Integer call() throws Exception {
            System.out.println(Thread.currentThread().getName()+" I am sleeping..");
            Thread.currentThread().sleep(sleepTime);
            return sleepTime;
        }
    }
}
