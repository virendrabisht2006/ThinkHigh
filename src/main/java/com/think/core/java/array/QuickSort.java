package com.think.core.java.array;

/**
 * Created by esha on 03/03/17.
 */
public class QuickSort {

    int a[];

    QuickSort(int a[]){
        this.a =a;
    }

    public static void main(String[] args) {
        int a[]={10,20,3,0,5,5,18,100,2,1,8,90,10,2,3};

        QuickSort quickSort = new QuickSort(a);
        quickSort.quickSort(0, a.length-1);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public void quickSort(int low, int heigh){

        int middle = low +(heigh -low)/2;

        int pivot = a[middle];

        int i =low, j = heigh;

        while (i <= j){
            while (a[i] < pivot){
                i++;
            }

            while (pivot < a[j]){
                j--;
            }

            if(i <= j){
                int temp =a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

            if(i < heigh){
                quickSort(i, heigh);
            }

            if(low < j){
                quickSort(low, j);
            }


        }

    }
}
