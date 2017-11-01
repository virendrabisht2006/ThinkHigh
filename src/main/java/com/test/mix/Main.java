package com.test.mix;

import java.util.Arrays;

/**
 * Created by esha on 30/04/16.
 */
public class Main {
    static void vaTest(int ... no) {
        System.out.print("vaTest(int ...): "
                + "Number of args: " + no.length +" Contents: ");
        for(int n : no)
            System.out.print(n + " ");
        System.out.println();
    }
    static void vaTest(boolean ... bl) {
        System.out.print("vaTest(boolean ...) " +
                "Number of args: " + bl.length + " Contents: ");
        for(boolean b : bl)
            System.out.print(b + " ");
        System.out.println();
    }
    static void vaTest(String abc,String msg, int ... no) {
        System.out.print("vaTest(String, int ...): " +abc +
                msg +"no. of arguments: "+ no.length +" Contents: ");
        for(int  n : no)
            System.out.print(n + " ");
        System.out.println();
    }
    public static void main(String args[]){
       // vaTest(1, 2, 3,5);
        //vaTest("Virendra","Testing: ",2, 10, 20);
        //vaTest(true, false, false);

        Object [] array = new Object[]{1,5,9,7,8,9};
        for(int i =0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------");
        Object [] copy = new Object[array.length+10];
        copy = Arrays.copyOf(array,array.length+10);
        for(int i =0;i<copy.length;i++) {
            System.out.println(copy[i]);
        }

        System.out.println("Length :"+copy.length);
    }
}