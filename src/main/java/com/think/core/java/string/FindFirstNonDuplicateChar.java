package com.think.core.java.string;

/**
 * Created by esha on 01/05/18.
 */
public class FindFirstNonDuplicateChar {
    static char aChar;

    public static void main(String[] args) {
        System.out.println(aChar);
        System.out.println(firstNonDuplicateCharInString("abcdaebonfjs") == 'c');
    }

    private static char firstNonDuplicateCharInString(String str) {
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            String subString = str.substring(i + 1, str.length());
            if (!subString.contains(String.valueOf(ch))) {
                return ch;
            }
        }

        return aChar;
    }
}
