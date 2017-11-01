package com.think.core.java.array;

/**
 * Created by esha on 20/02/17.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int a[] = {3,6,8,9,18,20,25};
        int b[] = {0, 1,2, 4,7,8};

        int aLength = a.length;
        int bLength = b.length;

        int c[] = new int[aLength+bLength];
        int i=0,j=0,k=0;
        while (i<aLength && j<bLength){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }

            while (i<aLength){
                c[k] = a[i];
                i++; k++;
            }

        while (j<bLength){
            c[k] = a[j];
            j++; k++;
        }

        for(int l=0;l<c.length;l++){
            System.out.println(c[l]);
        }
    }
}
