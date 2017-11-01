package com.think.core.java.file;

import java.io.*;

/**
 * Created by esha on 25/08/17.
 */
public class RenameFile {
    public static void main(String[] args) {
        String path = "/Users/esha/Downloads/Songs-2017/";
        File files[] = new File(path).listFiles();
        printFileInsideDir(files);
    }

    private static void printFileInsideDir(File files[]){
        for(File file : files){
            if(file.isDirectory()){
                String fileName = file.getAbsolutePath();
                int index = fileName.indexOf("(");
                System.out.println(file.renameTo(new File("/Users/esha/Downloads/Songs-2017/"+file.getName().substring(0, index-1))));
                printFileInsideDir(file.listFiles());
            }
            else {
                String fileName = file.getAbsolutePath();
                if(fileName.contains("SongsMp3")) {
                    int index = fileName.indexOf("(");
                    String newFileName = "/Users/esha/Downloads/Songs-2017/"+file.getName().substring(0, index-1)+".mp3";
                    System.out.println(file.renameTo(new File(newFileName)));
                }
            }
        }
    }
}
