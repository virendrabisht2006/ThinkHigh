package com.think.core.java.numeric;

import java.util.Arrays;

/**
 * Created by esha on 01/06/16.
 */
public class RemoveDupFromArray {
    public static void main(String[] args) {
        int a[] ={1,2,5,6,22,5,8,9,20,30,1,7,10,200,40,5,20,30,22,3,4,2,0,3,6,7,8,3,5,6,0,3,4,5,40,6,8,9,10};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" \t");
        }
        System.out.println("");
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                System.out.print(a[i]+" \t");
            }

        }
    }
}
