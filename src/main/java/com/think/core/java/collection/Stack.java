package com.think.core.java.collection;

/**
 * Created by esha on 01/06/16.
 */
public class Stack {
    private int a[];
    private int size;
    private int TOP;

    public Stack() {
        this.size = 10;
        this.a = new int[size];
        this.TOP = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("IsEmptyCheck: "+stack.isEmpty());

        stack.push(10);
        System.out.println("IsEmptyCheck: "+stack.isEmpty());
        System.out.println("IsFullCheck: "+stack.isFull());

        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        System.out.println("Item at Peek: "+stack.peek());

        stack.display();
    }

    public void push(int data){
       if(isFull()){
           System.out.println("Stack is Full..");
       }
        else
           a[++TOP]=data;
    }

    public void pop(){
        int item;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            item = a[TOP];
            System.out.println("Popped: "+item);
            TOP--;
        }
    }
    public int peek(){
        return a[TOP];
    }
    public boolean isFull(){
       return TOP==size-1;
    }

    public boolean isEmpty(){
      return TOP==-1;
    }
    public void display(){
        for(int i=0;i<=TOP;i++){
            System.out.println(a[i]);
        }
    }
}
