package com.think.core.java.numeric;

import java.util.Arrays;

/**
 * Created by esha on 01/06/16.
 */
public class FindUniuqeNumInArray {
    public static void main(String[] args) {
        int a[] ={1,2,5,6,22,5,8,9,20,30,1,7,10,200,40,5,20,30,22,3,4,2,0,3,6,7,8,3,5,6,0,3,4,5,40,6,8,9,10};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("--------------------");
        int lastElement;

        for(int i=0;i<a.length-2;i++){
            if(a[0]!=a[1]){
                lastElement=a[0];
                System.out.println(lastElement);
                break;
            }

            else if(a[i]!=a[i+1] && a[i+1] !=a[i+2]){
                lastElement=a[i+1];
                System.out.println(lastElement);
                break;

            }
           if(i==a.length-3) {
               if (a[a.length - 2] != a[a.length - 1]) {
                   lastElement = a[a.length - 1];
                   System.out.println(lastElement);
                   break;
               }
           }
        }
    }
}
