package com.think.core.java.searching;

import java.util.Scanner;

/**
 * Created by esha on 01/06/16.
 *
 * This is bruit force technique and complexity is O(n)
 */
public class LinearSearch {

    public static void main(String[] args) {
        int a[] ={1,2,5,6,22,5,8,9,20,30,1,7,10,200,40,5,20,30,22,3,4,2,0,3,6,7,8,3,5,6,0,3,4,5,40,6,8,9,10};

        int n = a.length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int find = scanner.nextInt();
        int i=0;
        for(i=0;i<n;i++){
            if(find == a[i]){
                System.out.println("First ocuurence of Item at Index: "+i);
                break;
            }

        }
        if(i==n){
            System.out.println("Item: "+find+" not found in Array.");
        }
    }
}
