package com.think.core.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by esha on 13/07/16.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aBCDE");
        list.add("ABCDE");
        list.add("DCBEF");
        list.add("dCBEF");

        list.add("AB2345");
        list.add("12345");

        System.out.println(list);

        Collections.sort(list);
        System.out.println("List after sorting.");
        System.out.println(list);

       // Collections.reverse(list);
        //System.out.println(list);
    }
}
