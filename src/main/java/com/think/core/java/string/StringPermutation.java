package com.think.core.java.string;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	private static Set<String> permStriingSet = new HashSet<>();
	public static void main(String[] args) {
		permutation("abcd");
		System.out.println(permStriingSet);
		//String str="abcd";
	//	System.out.println(str.substring(0,1)+str.substring(2,str.length()));
	//	System.out.println(str.substring(0,str.length()));
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n==0) {
	    	permStriingSet.add(prefix);
	    }
	    else {
			if (!prefix.isEmpty()) {
				permStriingSet.add(prefix);
			}
			for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
