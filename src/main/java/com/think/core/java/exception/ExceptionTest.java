package com.think.core.java.exception;

import com.think.core.java.collection.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esha on 09/03/17.
 */
public class ExceptionTest {
    public static void main(String[] args) throws OutOfMemoryError{
        try{
            System.out.println("We are here..");
            int i=0;
            String str ="Virendra";
            StringBuilder string =new StringBuilder();
            while (true){
                List linkedList = new ArrayList<Object>(i);
                str = new String(" "+i);
                string.append(str);
                Object[] objectses = new Object[i];
                String []arr = new String[1000000000];
                i++;
                throw new OutOfMemoryError();
            }
        }

        catch (Exception e){
            System.out.println("Its exception : "+e.getMessage());
        }
        catch (Error e){
            System.out.println("Its error : "+e.getMessage());
        }
    }
}


