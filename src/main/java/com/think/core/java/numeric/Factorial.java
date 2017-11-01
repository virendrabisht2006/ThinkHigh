package com.think.core.java.numeric;

import java.util.Scanner;

/**
 * Created by esha on 28/05/16.
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scanner.nextInt();

        System.out.println("Original Number: "+num);

        System.out.println("Factorial of Number using recursion is : "+factUsingRecursion(num));

        System.out.println("Factorial of Number using forloop is : "+factUsingLoop(num));
    }

    private static int factUsingLoop(int num) {
        int factNum=1;
        for(int i=1;i<=num;i++){
            factNum = factNum*i;
        }
        return factNum;
    }


    private static int factUsingRecursion(int number){
        if(number==1)
            return number;
        number = number*factUsingRecursion(number-1);
        return number;
    }
}
