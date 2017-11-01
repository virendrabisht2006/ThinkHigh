package com.think.core.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*'
 * How to find the word with the highest frequency from a file in Java
 */
public class HighFrequencyString {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
        System.out.println("Eneter the Line with repeted string:");
        //String str = sc.nextLine();
        String str= "hello guys how are you doing. guys hope everything fine in your part. guys all the best";
        System.out.println("Highest Frequency String: "+findHighFrequencyString(str));
        
	}
	private static String findHighFrequencyString(String str){
		String strArray[] = str.split(" ");
		Map<String,Integer> stringToCount =  new HashMap<>();
		for(int i=0;i<strArray.length;i++){
			String key = strArray[i];
			if(stringToCount.containsKey(key)){
				int currentCount = stringToCount.get(key);
				stringToCount.put(key, ++currentCount);
			}
			else{
				stringToCount.put(key, 1);
			}
		}
		System.out.println(stringToCount);
		Set<Entry<String,Integer>> set = stringToCount.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(set); 
		
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
			@Override
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		str=list.get(0).getKey()+" : "+list.get(0).getValue();
		return str;
	}

}
