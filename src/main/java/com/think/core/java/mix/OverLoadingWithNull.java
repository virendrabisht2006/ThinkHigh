package com.think.core.java.mix;

/**
 * Created by esha on 05/06/16.
 */
public class OverLoadingWithNull {
    public static void main(String[] args) {
        OverLoadingWithNull overLoadingWithNull = new OverLoadingWithNull();
        overLoadingWithNull.m1(null);
        overLoadingWithNull.m1(new Object());
        overLoadingWithNull.m1("null");
    }

    public void m1(Object o){
        System.out.println("Inside Object M1");
    }

    public void m1(String s){
        System.out.println("Inside String M1");
    }
}
