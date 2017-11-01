package com.think.core.java.collection;

import java.util.*;

/**
 * Created by esha on 19/01/17.
 */
public class MaxOccuringText {

    private static Map<String, Integer> stringToInt = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str="Virendra Esha Virendra Hello Hi Virendra where is Esha";

        System.out.println("ENter top records you want to fetch: ");

        int topRecord = scanner.nextInt();

        getTopStr(str, topRecord);



    }


    private static void getTopStr(String str, int topRecord){

        String string[] = str.split(" ");

        for (int i=0; i<string.length;i++){
            String key = string[i];
            if(stringToInt.containsKey(key)){
                int count = stringToInt.get(key);
                count = count+1;
                stringToInt.put(key, count);
            }
            else {
                stringToInt.put(key, 1);
            }
        }

        List<String> listMap = new ArrayList<>(stringToInt.keySet());

        Collections.sort(listMap, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return stringToInt.get(o2).compareTo(stringToInt.get(o1));
            }
        });

        int i=1;
        for(String entry:listMap){
            if(topRecord >listMap.size()){
                System.out.println("No of requested record is more than the size of map");
                break;
            }
            if(i<=topRecord) {
                System.out.println(entry + " ==== " + stringToInt.get(entry));
                i++;
            }
            else break;
        }
    }
}
