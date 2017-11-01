package com.think.core.java.sorting;

/**
 * Created by esha on 01/06/16.
 *
 * Selection sort is compare each adjacent element after first pass, smallest element wil be in its position.
 * Worst and average case complexity of selection sort is O(n2), where n is the number of element to be sorted.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] ={1,2,5,6,22,5,8,9,20,30,1,7,10,200,40,5,20,30,22,3,4,2,0,3,6,7,8,3,5,6,0,3,4,5,40,6,8,9,10};

        int n=a.length;
        int temp;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }

        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" \t");
        }
    }
}
