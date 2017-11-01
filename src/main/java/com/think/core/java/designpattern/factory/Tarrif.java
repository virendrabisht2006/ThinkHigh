package com.think.core.java.designpattern.factory;

/**
 * Created by esha on 14/02/17.
 */
public abstract class Tarrif {

    public double rate;

    private static final double flatRate = 3;

    private static final int intialUnit =100;

    public double calculate(int units){
        double finalBill =0;

        if(units<=0){
            return finalBill;
        }

        if(units>= intialUnit){
            finalBill = finalBill + intialUnit*flatRate;
            units = units - intialUnit;
        }

        finalBill = finalBill + units * getRate();

        return finalBill;
    }

    abstract double getRate();
}
