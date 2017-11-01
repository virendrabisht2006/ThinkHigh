package com.think.core.java.designpattern.factory;

/**
 * Created by esha on 14/02/17.
 */
public enum PlanType {
    COMMERCIAL("commercial"),
    HOME("home"),
    GOVERMENTSUBSIDERY("commercial");

    String displayName;

    PlanType(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
