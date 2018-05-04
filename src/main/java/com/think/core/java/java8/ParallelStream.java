package com.think.core.java.java8;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class ParallelStream {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        System.out.println(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i <= 10000000; i++) {
            integers.add(i);

        }
        System.out.println("size before add: " + integers.size());
        integers.addAll(integers);
        integers.addAll(integers);
        System.out.println("size after add: " + integers.size());
        Instant start = Instant.now();

        ForkJoinPool forkJoinPool = new ForkJoinPool(8);

        forkJoinPool.submit(() -> integers.parallelStream().filter(s -> isEvenNumber(s)).collect(Collectors.toList()));
        //integers.stream().filter(s -> isEvenNumberStr(s)).collect(Collectors.toList());
        Instant end = Instant.now();
        System.out.println("Time Taken: " + Duration.between(start, end));
    }

    private static boolean isEvenNumber(int number) {

   /*     List<Integer> integerList = Arrays.asList(0,2,4,6,8);

        int lastDigit = Math.abs(number) % 10;*/

        return number % 2 == 0;
    }
}
