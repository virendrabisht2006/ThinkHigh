package com.think.core.java.mix;

import java.util.PriorityQueue;

/**
 * Created by esha on 26/11/16.
 */
public class NewTest {

    public static void main(String[] args) {
        String T="nice";
        String S = "niece";
        String expected = "DELETE ";
        int sLength = S.length();
        String tempS=S;

        char[] charArray = S.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            tempS = tempS.substring(0,i)+tempS.substring(i+1, sLength);
            if(T.equals(tempS)){
               expected = expected + charArray[i] ;
                break;
            }
            else {
                tempS =S;
            }
        }
        System.out.println(expected);
    }
}
