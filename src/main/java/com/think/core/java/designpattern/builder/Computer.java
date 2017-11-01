package com.think.core.java.designpattern.builder;

/**
 * Created by esha on 14/02/17.
 */
public class Computer {

    private String mouse;

    private String keyBoard;

    private String cpu;

    public String getKeyBoard() {
        return keyBoard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMouse() {
        return mouse;
    }

    Computer(){

    }

    Computer(ComputerBuilder computerBuilder){
        this.mouse = computerBuilder.mouse;
        this.keyBoard = computerBuilder.keyBoard;
        this.cpu = computerBuilder.cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mouse='" + mouse + '\'' +
                ", keyBoard='" + keyBoard + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
