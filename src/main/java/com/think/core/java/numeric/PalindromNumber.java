package com.think.core.java.numeric;

import java.util.Scanner;

/**
 * Created by esha on 28/05/16.
 */
public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Number:");
        int num = scanner.nextInt();
        int original =num;
        int rem, finalNo=0;
        while (num>=1){
            rem =num%10;
            finalNo =finalNo*10+rem;
            num =num/10;
        }
        if (original==finalNo){
            System.out.println("The input number: "+original+" Is palindrom");
        }
        else System.out.println("Number is not palindrom");
    }
}
