package com.think.core.java.mix;

import java.io.IOException;

/**
 * Created by esha on 19/10/16.
 */
public class ChildClass implements IChild {




    public static void main(String[] args) {
        IChild iChild = new ChildClass();

        IBase iBase = new ChildClass();

        try {
            iChild.display();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            iBase.display();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void display() {
        System.out.println("DIsplay method");
    }
}
