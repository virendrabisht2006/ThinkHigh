package com.think.core.java.designpattern.factory;

import java.util.Scanner;

/**
 * Created by esha on 14/02/17.
 */
public class BescomBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the plan type:");

        String plantype = scanner.nextLine();

        System.out.println("Enter the no. of units:");

        int  units = scanner.nextInt();

        TarrifFactory tarrifFactory = new TarrifFactory();
        Tarrif tarrif = tarrifFactory.getTarrifPlan(plantype);

        double totalBill = tarrif.calculate(units);

        System.out.println("Total generated bill : "+totalBill);


    }
}
