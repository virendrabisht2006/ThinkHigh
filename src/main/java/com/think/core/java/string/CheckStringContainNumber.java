package com.think.core.java.string;

import java.util.Scanner;

/*
 * How to check if a String contains only numeric digits
 */
public class CheckStringContainNumber {

	public static void main(String[] args) throws Exception{
		System.out.println("Enter the String contain number as well.");
		Scanner sc = new Scanner(System.in);
		String string =sc.nextLine();
		if(checkStringContainsOnlyNumber(string)){
			System.out.println("String contains numbers");
		}
		checkStringContainsNumber(string);
		sc.close();


	}
	
	private static boolean checkStringContainsOnlyNumber(String string){
		String numRegex="\\d+";
		System.out.println(string.matches(numRegex));
		return string.matches(numRegex);
		
	}
	
	private static void checkStringContainsNumber(String s){
		char array[] =s.toCharArray();
		for(int i=0;i<s.length();i++){
			int ascii=(int) array[i];
			if(ascii>=48 && ascii<=57){
				System.out.println("Srring :"+s+" conatsins number: "+array[i]);
				break;
			}
			
		}
		
	}

}
