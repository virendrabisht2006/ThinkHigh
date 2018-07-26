package com.think.core.java.oops;

/**
 * Created by esha on 26/01/18.
 */
public class ChildClass extends AbstractTest implements InterfaceTest {

    public static void main(String[] args) {
        InterfaceTest it = new ChildClass();
        // it.number = 100;
        System.out.println("Hello  Number: " + number);
    }


}
