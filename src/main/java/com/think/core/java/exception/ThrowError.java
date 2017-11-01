package com.think.core.java.exception;


import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by esha on 19/07/17.
 */
public class ThrowError {

    public static void main(String[] args) throws Throwable {
        try{
            String actual ="Virendra";
            String expected ="Singh";
           // Assert.assertEquals(actual, expected);
            while(true){
                List<Object> list = new ArrayList<>(1000000000);
            }

        }
        catch (Error e){
            System.out.println("error occured: "+ e);
            //throw  new Error(e);
        }
    }
}
