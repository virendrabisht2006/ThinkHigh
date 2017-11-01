package com.think.core.java.designpattern.builder;

/**
 * Created by esha on 14/02/17.
 */
public class ComputerBuilder {

    public String mouse;

    public String keyBoard;

    public String cpu;

    public ComputerBuilder addMouse(String mouse){
        this.mouse = mouse;
        return this;
    }

    public  ComputerBuilder addKeyBoard(String keyBoard){
        this.keyBoard = keyBoard;
        return this;
    }

    public ComputerBuilder addCpu(String cpu){
        this.cpu =cpu;
        return this;

    }

    public Computer build(){
        return new Computer(this);
    }

    ComputerBuilder(){

    }

/*    ComputerBuilder(Computer computer){
        this.mouse = computer.getMouse();
        this.cpu = computer.getCpu();
        this.keyBoard = computer.getKeyBoard();
    }*/

}
