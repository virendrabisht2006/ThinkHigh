package com.think.core.java.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by esha on 01/06/18.
 */
public class StringMaxLength {

    public static void main(String[] args) {
        String S = "Forget CVs.. Save time . x x";
        String[] sentences = S.split("[.;?]");
        List<String> strings = Arrays.asList(sentences);
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        String finalString[] = strings.get(0).trim().split(" ");
        System.out.println(finalString.length);

//        Map<String, Integer> result = strings.stream().sorted()(Map.Entry<String, Integer> compareByValue)

    }
}
