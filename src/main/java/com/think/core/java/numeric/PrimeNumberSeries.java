package com.think.core.java.numeric;

import java.util.Scanner;

/**
 * Created by esha on 28/05/16.
 */
public class PrimeNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length: ");
        int length = scanner.nextInt();
        int b=0;
        System.out.println(1+" \n" +2+" \n"+3);
        for(int i=4;i<=length;i++){
            for (int j=2;j<i;j++) {
                b=i%j;
                if(b==0){
                    break;
                }
            }
            if(b!=0){
                System.out.println(i);
            }

        }
    }
}
