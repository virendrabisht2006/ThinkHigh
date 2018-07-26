package com.think.core.java.java8;

/**
 * Created by esha on 01/06/18.
 */
public class NumberTest {
    public static void main(String[] args) {
        int n = 123456;
       /* int copy = n;
        int multiplier =1;
        String finalNumber="";
        int counter =0;
        while(n>1){
            n = n/10;
            multiplier = multiplier *10;
            counter++;
        }
        int divider = 10;
        for(int i=1;i<=counter;i++){
            int last = copy%divider;
            int start = copy/multiplier;
            if(i==counter){
                finalNumber = finalNumber + last;
            }
            else {
                finalNumber = finalNumber + start + last;
            }
            multiplier = multiplier/10;
            divider = divider*10;
           // copy = copy/10;
        }
*/
        String finalNumber = "";
        String number = String.valueOf(n);
        int length = number.length();
        int counter = 0;
        if (length % 2 == 0) {
            counter = length / 2;
        } else {
            counter = (length + 1) / 2;
        }
        for (int i = 0; i < counter; i++) {
            if (counter - 1 == i && !(length % 2 == 0)) {
                finalNumber = finalNumber + number.charAt(i);
            } else {
                finalNumber = finalNumber + number.charAt(i) + number.charAt(length - i - 1);
            }
        }
        System.out.println(finalNumber);

    }
}
