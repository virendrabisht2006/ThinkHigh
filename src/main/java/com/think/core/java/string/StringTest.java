package com.think.core.java.string;

/**
 * Created by esha on 18/02/17.
 */
public class StringTest {
    public static void main(String[] args) {
        String str1="Virendra";

       // String str2= new String("Virendra");

        String str2= "Virendra";

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));



        System.out.println(str1.intern());

        System.out.println(str1.hashCode()+ "="+ str2.hashCode());
    }
}
