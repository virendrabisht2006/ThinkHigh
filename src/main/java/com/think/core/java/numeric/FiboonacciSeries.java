package com.think.core.java.numeric;

import java.util.Scanner;

/**
 * Created by esha on 28/05/16.
 */
public class FiboonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scanner.nextInt();

        System.out.println(1);
        int previous=1, previousToPrevious=0,temp=0;

        for(int i=1;i <= num;i++){
            temp =previous+previousToPrevious;
            previousToPrevious=previous;
            previous = temp;
            System.out.println(temp);

        }
    }
}
