package com.think.core.java.designpattern.builder;

/**
 * Created by esha on 14/02/17.
 */
public class BuilderTest {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();

        Computer computer = computerBuilder.addMouse("LogicTech").addKeyBoard("New Logictech").build();
        System.out.println(computer);
        computer = computerBuilder.addCpu("Microsoft").build();

        System.out.println(computer);
    }
}
