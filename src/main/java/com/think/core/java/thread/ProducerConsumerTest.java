package com.think.core.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by esha on 18/02/17.
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int maxSize =10;
        Thread producer = new Thread(new Producer(list,maxSize),"Producer");

        Thread consumer = new Thread(new Consumer(list, maxSize), "Consumer");

        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable{
    private List<Integer> list;

    private int maxSize;

    Producer(List list, int maxSize){
       this.list = list;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            add(i);
        }
    }

    private void add(int item){
        while (list.size() == maxSize){
            synchronized (list){
                try {
                    System.out.println(Thread.currentThread().getName()+" Waiting. ");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (list){
            System.out.println("Item Added to List: "+item);
            list.add(item);
            list.notify();
        }
    }
}

class Consumer implements Runnable{
    private List<Integer> list;
    private int maxSize;

    Consumer(List list, int maxSize){
        this.list = list;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            System.out.println("Item removed: "+remove());
        }
    }

    private int remove(){
        int item=0;
        while (list.size() == 0){
            synchronized (list){
                try {
                    System.out.println(Thread.currentThread().getName()+" Waiting. ");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (list){
            list.notify();
            item = list.remove(0);

        }
        return item;
    }


}