package com.think.core.java.java8;

import java.util.stream.Stream;

/**
 * Created by esha on 16/07/17.
 */
public class StreamTest {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        stream.forEach(s -> System.out.println(s));


    }
}
