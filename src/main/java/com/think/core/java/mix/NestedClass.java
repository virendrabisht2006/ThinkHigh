package com.think.core.java.mix;

/**
 * Created by esha on 27/05/16.
 */
public class NestedClass {
    private String className;
    private int classId;

    public NestedClass(String className, int classId) {
        this.className = className;
        this.classId = classId;
    }

    public String getClassName() {
        return className+classId;
    }

    public int getClassId() {
        return classId;
    }

    class InnerClass{
        private String className;
        private int classId;

        private void outerClassAtrr(){
            System.out.println("ClassName: "+getClassName());
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass("OuerClass",1);
        InnerClass innerClass = nestedClass.new InnerClass();
        innerClass.outerClassAtrr();
    }
}
