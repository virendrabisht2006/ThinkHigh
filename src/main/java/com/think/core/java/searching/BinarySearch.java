package com.think.core.java.searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Virendra on 01/06/16.
 *
 * BinarySearch search a specified element in Array. If it found returns the Index of element found else return -1, which is start of element
 * or place where element can be inserted.
 *
 * Element to be search compare with the middle element of Array if element lesser than middle element than first half array will be search else
 * 2nd half array will be search.
 *
 * To use binary search the Array should be sorted, or else it won't produce the desire result.
 *
 * The time complexity of binary search is O(log(n))
 */
public class BinarySearch {
    public static void main(String[] args) {
        int a[] ={1,2,5,6,22,5,8,9,20,30,1,7,10,200,40,5,20,30,22,3,4,2,0,3,6,7,8,3,5,6,0,3,4,5,40,6,8,9,10};

        int n = a.length;

        Arrays.sort(a);

        System.out.println("Sorted Array.");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " \t");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the element to be search.");
        int element = scanner.nextInt();

        int index = binarySerach(a, 0, a.length-1 ,element);

        if(index!=-1){
            System.out.println("Element: "+element+" found in Array a at index: "+index);
        }
        else
            System.out.println("Input element does'nt exist in Array a.");
    }

    public static int binarySerach(int a[],int lowIndex,int upperIndex, int element){

        int middle =lowIndex+(upperIndex-lowIndex)/2;

        if(null ==a || a.length ==0 || middle>upperIndex){
            return -1;
        }

        int middleElement = a[middle];
        int index;

        if(element == middleElement){
            index = middle;
        }
        else if(element>middleElement){
            index = binarySerach(a, middle+1, upperIndex, element);

        }
        else{
            index = binarySerach(a, lowIndex, middle, element);
        }
       return index;
    }
}
