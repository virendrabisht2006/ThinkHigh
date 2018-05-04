package com.think.core.java.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by esha on 17/01/18.
 */
public class ProcessFileParallely {

    private static final int ONE_MB = 1024 * 1024;

    public static void main(String[] args) throws IOException {

        BufferedInputStream br = new BufferedInputStream(new FileInputStream(new File("pom.xml")));

        /*String line = null;
        byte[] bytes = new byte[ONE_MB]; //1 MB

        while (br.read(bytes) !=-1){
            System.out.println(new String(bytes));

        }*/


        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores: " + cores);
        long start = System.currentTimeMillis();
        // readWithJava8("/Users/esha/Desktop/Virendra/Projects/ThinkHigh/pom.xml");
        readWithJava8GroupBY("/Users/esha/Desktop/Virendra/Projects/ThinkHigh/pom.xml");
        long end = System.currentTimeMillis();

        System.out.println("Time taken by method: " + (end - start) / 1000 + "sec");

        //  System.out.println(bytes.length);
    }

    private static void readWithJava8GroupBY(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            Stream<String> stringOfString = stream.map(line -> line.split(" ")).flatMap(Arrays::stream);
            Map<String, Long> lineCountMap = stringOfString.collect(Collectors.groupingBy(
                    Function.identity(), Collectors.counting()
            ));
            System.out.println(lineCountMap);
        } catch (IOException io) {
            io.printStackTrace();
        }


    }

    private static void readWithJava8(String fileName) {

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            //get direcorty and list all the file in that direcory and process parralley
            File file = new File(fileName);
            if (file.isDirectory()) {
                File[] files = file.listFiles();

                for (File f1 : files
                        ) {
                    //process each file
                }

            }
            //

            stream.parallel();
            stream.forEach(str -> {
                try {
                    /*System.out.println(Thread.currentThread().getThreadGroup().activeCount());
                    System.out.println(Thread.currentThread().getName());*/
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(str);

            });


        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
