package com.think.core.java.sorting;

import java.util.*;

/**
 * Created by esha on 02/06/16.
 *
 Class 	Sorting algorithm
 Data structure 	Array
 Worst case performance 	О(n2/2) comparisons, swaps
 Best case performance 	O(n) comparisons, O(1) swaps
 Average case performance 	О(n2) comparisons, swaps
 Worst case space complexity 	О(n) total, O(1) auxiliary
 */
public class InsertionSort {

    public static void main(String[] args) {

        int a[] = {1, 2, 5, 6, 22, 5, 8, 9, 20, 30, 1, 7, 10, 200, 40, 5, 20, 30, 22, 3, 4, 2, 0, 3, 6, 7, 8, 3, 5, 6, 0, 3, 4, 5, 40, 6, 8, 9, 10};

        int n = a.length;
        int temp;

      /*  for(int i=1;i<n;i++){
            for(int k=i;k>0;k--){
                if(a[k-1]>a[k]){
                    temp=a[k-1];
                    a[k-1]=a[k];
                    a[k]=temp;
                }
            }

        }
        System.out.println("Sorted Array..");
      //  int b[] = insertSort(a);

        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
*/
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(a[i]);
        }

       System.out.println(insertSort(numbers));
    }

    public static List<Integer> insertSort(final List<Integer> numbers) {
        final List<Integer> sortedList = new LinkedList<>();
        originalList: for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++)
            {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        return sortedList;
    }

    /*public static int[] insertSort(int a[]){
        final int sortedArray[];
        start: for(int i=0;i<a.length;i++){
            for(int j=0;j<sortedArray.length;j++){
                if(a[i] < sortedArray[j]){
                    sortedArray[j] = a[i];
                    continue start;
                }
            }
            sortedArray[sortedArray.length]= a[i];

        }
        return sortedArray;
    }*/

}
