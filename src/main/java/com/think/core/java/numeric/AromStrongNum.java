package com.think.core.java.numeric;

import java.util.Scanner;

/**
 * Created by esha on 28/05/16.
 */
public class AromStrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Number: ");
        int num = scanner.nextInt();
        int original = num,rem;
        int finalNum=0;

        while(num>=1){
            rem = num%10;
            finalNum = finalNum+rem*rem*rem;
            num = num/10;
        }
        if (original==finalNum){
            System.out.println("Given Number: "+original+" is armstrong ");
        }
        else System.out.println("Given Number is not armstrong number");
    }
}
