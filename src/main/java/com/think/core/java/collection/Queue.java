package com.think.core.java.collection;

/**
 * Created by esha on 01/06/16.
 */
public class Queue {
    private int a[];
    private int size;
    private int REAR;
    private int FRONT;

    Queue(){
        this.size=10;
        this.a = new int[size];
        this.REAR =-1;
        this.FRONT =0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("IsEmptyCheck: "+queue.isEmpty());

        queue.add(10);
        System.out.println("IsEmptyCheck: "+queue.isEmpty());
        System.out.println("IsFullCheck: "+queue.isFull());

        queue.add(20);
        queue.add(30);
        queue.display();

        queue.remove();
        System.out.println("Item at Peek: "+queue.peek());

        queue.display();
    }

    public void add(int data){
        if (isFull()){
            System.out.println("Queue is Full, Can not add element.");
        }
        else
        {
            a[++REAR]=data;
        }
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty Can not reomve..");
        }else
        {
            System.out.println("Element removed: "+a[FRONT]);
            FRONT++;
        }
    }

    public int peek(){
        return a[FRONT];
    }
    public boolean isFull(){
        return REAR==size-1;
    }

    public boolean isEmpty(){
        return REAR==-1;
    }
    public void display(){
        for(int i=0;i<=REAR;i++){
            System.out.println(a[i]);
        }
    }
}
