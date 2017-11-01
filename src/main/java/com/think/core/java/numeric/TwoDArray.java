package com.think.core.java.numeric;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esha on 19/01/17.
 */
public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {{1,0,0,1,0},{0,1,1,0,1},{0,0,1,0,1},{0,1,0,1,1}};
        List<String> oneList = new ArrayList<String>();
        List<String> zeroList = new ArrayList<String>();
        int row=4; int column=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(a[i][j]+", ");
            }
            System.out.println("\n");
        }
    }
}
