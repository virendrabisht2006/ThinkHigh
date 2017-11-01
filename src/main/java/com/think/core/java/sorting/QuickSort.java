package com.think.core.java.sorting;

/**
 * Created by esha on 01/06/16.
 *
 * Quick sort also use divide and conquer approach. Means big larger list/array divided into smaller
 * one until it is no more divided.
 * And then merge them back as sorted array.
 * Quick sort operate on same array/list. so memory efficiency is very high in quick sort.
 * Since quick sort doest not require additional storage.
 *
 * After first pass pivot element will be its final position
 *
 * Average case complexity for Quick sort is O(nLog(n)). while worst case complexity is O(n2).
 *
 * NOTE- In Java, Arrays.sort() method uses quick sort algorithm to sort array of primitives.
 */
public class QuickSort {

    private int a[];

    QuickSort(int a[]){
        this.a = a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 22, 5, 8, 9, 20, 30, 1, 7, 10, 200, 40, 5, 20, 30, 22, 3, 4, 2, 0, 3, 6, 7, 8, 3, 5, 6, 0, 3, 4, 5, 40, 6, 8, 9, 10};
        QuickSort qs=  new QuickSort(a);
        System.out.println("Array before sort");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" \t");
        }

        int n = a.length;
        qs.sort(a);
        System.out.println();
        System.out.println("Array after sort");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" \t");
        }

    }

    public  void quickSort(int low, int high){
            int middle =low+(high-low)/2;
            int pivot = a[middle];
        int i=low;
        int j=high;

        while(i <= j){
            /**
             * As shown in above image, In each iteration, we will identify a
             * number from left side which is greater then the pivot value, and
             * a number from right side which is less then the pivot value. Once
             * search is complete, we can swap both numbers.
             */

            //check pivot from left side of array
            while (pivot > a[i]){
                i++;
            }

            //check pivot with right side of array
            while(pivot < a[j]){
                j--;
            }

            if( i<=j ){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

                // move index to next position on both sides
                i++;
                j--;
            }

        }

        // calls quickSort() method recursively
        if(low < j){
            quickSort(low,j);
        }

        // calls quickSort() method recursively
        if(high > i){
            quickSort(i,high);
        }
    }

    public void sort(int a[]){
        int low=0;
        int high=a.length-1;
        quickSort(low,high);
    }
}
