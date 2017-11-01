package com.think.core.java.sorting;

/**
 * Created by esha on 01/06/16.
 */


/*
Bubble sort work on comparing of each adjacent element. after first iteration biggest element will be in its position.
Bubble sort has worst and average case complexity of O(n2). where n is the number of element to be sorted. So bubble sort
is not a practical sorting algorithm if n is relatively high.

In best case bubble sort complexity is O(n), means when element are already sorted.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] ={1,2,5,6,22,5,8,9,20,30,1,7,10,200,40,5,20,30,22,3,4,2,0,3,6,7,8,3,5,6,0,3,4,5,40,6,8,9,10};

        int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }

        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" \t");
        }


    }
}
