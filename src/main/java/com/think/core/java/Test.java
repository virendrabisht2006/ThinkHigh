package com.think.core.java;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by esha on 20/01/17.
 */
public class Test {


    public static void main(String[] args) {
       /* System.out.println(Test.check("[()]"));   // true
        System.out.println(Test.check("(()[])")); // true
        System.out.println(Test.check("([)]"));   // false*/


    }


    static boolean check(String str) {

        String previous = "";
        while (str.length() != previous.length())
        {
            previous = str;
            str = str.replace("()", "")
                    .replace("[]", "");
        }
        return (str.length() == 0);

    }
}
