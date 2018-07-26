package com.think.core.java.collection;

/**
 * Created by esha on 12/05/18.
 */

//sort string array with length of each element
public class StringArraySort {
    public static void main(String[] args) {
       /* String str = "hello how are you welcome to india Jainii";
        List<String> stringList = Arrays.asList(str.split(" "));
        Comparator<String> compByLength = (aName, bName) -> bName.length() - aName.length();
        stringList.sort(compByLength);
        System.out.println(stringList);
        String largestEvenLengthWord = stringList.stream().filter(s -> s.length()%2==0).findFirst().get();
        System.out.println(largestEvenLengthWord);*/

        String strs[] = {"1", "2", "3", "4"};

        int j = strs.length - 1;

        for (int i = 0; i < strs.length / 2; i++) {
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            j--;
        }

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }


    }
}
