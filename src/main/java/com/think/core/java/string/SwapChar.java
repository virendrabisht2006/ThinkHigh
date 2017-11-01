package com.think.core.java.string;

public class SwapChar {

	 public static void main(String[] args) {

	        System.out.println("Hello World!");
	        String S="From", T="Form";
	        char [] charArray=T.toCharArray();
	        for(int i=0;i<charArray.length;i++){
	            charArray=T.toCharArray();
	           char temp =charArray[i];
	           char temp_1=charArray[i+1];//just to check later
	            charArray[i]=charArray[i+1];
	            charArray[i+1]=temp;
	            String s2= new String(charArray);
	            if(s2.equals(S)) {
	                System.out.println("Swap " + temp + " " + temp_1);
	                break;

	            }
	        }
	    }
}
