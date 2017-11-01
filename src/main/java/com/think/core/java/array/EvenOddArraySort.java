package com.think.core.java.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by esha on 16/03/17.
 */
public class EvenOddArraySort {
    public static void main(String[] args) {
        Integer a[]={10,20,3,0,5,5,18,100,2,1,8,90,10,2,3};

        System.out.println("Array Before SOrt!");

        display(a);

        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o1%2==0 && o2%2 !=0){
                    return -1;
                }
                else if(o2%2==0 && o1%2 !=0){
                    return 1;
                }
                else
                return o1.compareTo(o2);
            }
        });

        display(a);
    }

    private static void display(Integer a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" \t");
        }
        System.out.println("\n");
    }

}
