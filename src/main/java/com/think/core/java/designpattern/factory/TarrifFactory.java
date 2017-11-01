package com.think.core.java.designpattern.factory;

/**
 * Created by esha on 14/02/17.
 */
public class TarrifFactory {

    public Tarrif getTarrifPlan(String type){

        if(type.equals(PlanType.COMMERCIAL.getDisplayName())){
            return  new CommercialTarrif();
        }
        else if(type.equals(PlanType.HOME.getDisplayName())){
            return new HomeTarrif();
        }

        return null;
    }
}
