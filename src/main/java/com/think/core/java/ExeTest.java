package com.think.core.java;

/**
 * Created by esha on 29/08/17.
 */
public class ExeTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("[");
      for(int i=0;i<=1000000;i++){
        sb.append(i).append(",");
      }
        sb.append("]");
        System.out.println(sb);
    }
}
