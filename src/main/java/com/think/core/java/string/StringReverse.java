package com.think.core.java.string;

import java.util.Scanner;

/**
 * Created by esha on 28/05/16.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String string = scanner.nextLine();
        System.out.println("String Orginal: "+string);

        System.out.println("*******Using Recursion******");

        System.out.println(revStringUsingRecursion(string));

        System.out.println("-------Using ForLoop---------");

        System.out.println(revStringUsingLoop(string));
    }

    public static String revStringUsingRecursion(String str){
        if(str.length()==1){
            return str;
        }
        String last = str.substring(str.length()-1,str.length());

        return last+revStringUsingRecursion(str.substring(0,str.length()-1));
    }

    public static String revStringUsingLoop(String str){
        String string="";
        for(int i=str.length()-1;i>=0;i--){
            string =string+str.charAt(i);
        }
        return string;
    }
}
