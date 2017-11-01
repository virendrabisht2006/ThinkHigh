package com.think.core.java.sorting;

/**
 * Created by esha on 01/06/16.
 *
 * Merge sort is a sorting technique based on divide and conquer technique. With worst-case time complexity being Ο(n log n),
 * it is one of the most respected algorithms.
 * Merge sort first divides the array into two equal halves until it is no more divided. By definition single element in the list is sorted.
 * . then combines the smaller sorted list in a sorted manner.
 *
 * Merge sort is a fast, stable sorting routine with guaranteed O(n*log(n)) efficiency. When sorting arrays,
 * merge sort requires additional scratch space proportional to the size of the input array. So space complexity os O(n) for merge additional
 * to time complexity.
 *
 * Step 1 − if it is only one element in the list it is already sorted, return.
 *
 * Step 2 − divide the list recursively into two halves until it can no more be divided.
 *
 * Step 3 − merge the smaller lists into new list in sorted order.
 */
public class MergeSort {

    private int tempArray[];

    MergeSort(int length){
        this.tempArray = new int[length];
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 22, 5, 8, 9, 20};

        int n = a.length;

        MergeSort mergeSort = new MergeSort(n);
        mergeSort.sort(a,0,n-1);

        System.out.println("Array after merge sort..");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" \t");
        }

    }

    public void sort(int a[],int low, int high){

        int middle;
        if(low < high){
           middle = low+ (high-low)/2;
            sort(a,low,middle);
            sort(a,middle+1,high);
            merge(a,low,middle,high);
        }
    }

    public void merge(int a[],int low, int middle, int high){

        //copy element to tempArray from low to high.

        for(int i=low;i<=high;i++){
            tempArray[i]=a[i];

        }

        int i= low, k=low;
        int j=middle+1;

        while (i<= middle && j <=high){
            if(tempArray[i] <= tempArray[j]){
                a[k] = tempArray[i];
                i++;
            }
            else{
                a[k] =tempArray[j];
                j++;
            }
            k++;
        }

        //copy all element to array from low to middle.

        while (i<=middle){
            a[k] = tempArray[i];
            k++;
            i++;
        }

        //copy all the element from tempArray from middle to high
        while (j<=high){
            a[k] = tempArray[j];
            k++;
            j++;
        }

    }
}
