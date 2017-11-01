package com.think.core.java.numeric;

/**
 * Created by esha on 20/01/17.
 */
public class FindElements {

    public static void main(String[] args) {
        int[] ints = {9, 14, 37, 102};
        System.out.println(FindElements.exists(ints, 102)); // true
        System.out.println(FindElements.exists(ints, 36)); // false
    }

        static boolean exists(int[] ints, int k) {
            int low=0;
            int high=ints.length;

            return checkNumber(ints, low, high, k);

        }

        private static boolean checkNumber(int ints[], int low, int high, int k){
            int middle = low + (high-low)/2;

            int item = ints[middle];

            if(k==item){
                return true;
            }
            else if(low ==0 && k!=ints[0]|| high == ints.length && k!=ints[high-1]){
                return false;
            }

            else if(k>item){
                low = middle+1;
                return checkNumber(ints, low, high, k );

            }
            else if(k<item){
                high = middle;
                return checkNumber(ints, low, high, k );
            }

            return false;
        }
    }



