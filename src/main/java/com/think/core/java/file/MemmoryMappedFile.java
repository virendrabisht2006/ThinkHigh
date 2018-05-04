package com.think.core.java.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by esha on 20/01/18.
 */
public class MemmoryMappedFile {

    private static final int BUFFER_SIZE = 10 * 1024 * 1024; // 10 MB data as buffer

    public static void main(String[] args) {
        String pathName = "/Users/esha/Desktop/Virendra/Projects/ThinkHigh/src/main/resources/pom.xml";
        try (RandomAccessFile memoryMappedFile = new RandomAccessFile(pathName, "r")) {
            FileChannel channel = memoryMappedFile.getChannel();
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            ;
            //   byte[] bytes = new byte[mappedByteBuffer.remaining()];
            // mappedByteBuffer.get(bytes);

//
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < mappedByteBuffer.limit(); i++) {
                // System.out.println(mappedByteBuffer.get());
                stringBuilder.append(mappedByteBuffer.get(i));

            }
            System.out.println(stringBuilder);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
