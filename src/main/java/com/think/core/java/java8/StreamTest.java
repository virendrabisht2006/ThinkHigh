package com.think.core.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by esha on 16/07/17.
 */
public class StreamTest {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        // stream.parallel(s -> System.out.println(s));

        List list = new ArrayList<String>();
        list.add("FirstElement");
        List numbers = Arrays.asList(1, 2, 3, 4, 5);
        list.remove(0);


        System.out.println(list.get(0));


    }
}
