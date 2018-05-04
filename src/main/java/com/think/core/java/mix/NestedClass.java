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

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass("OuerClass", 1);
        InnerClass innerClass = nestedClass.new InnerClass("INner claas", 100);
        innerClass.outerClassAtrr();

        System.out.println(innerClass.getClassId() + innerClass.getClassName());
    }

    public String getOUterClassName() {
        return className+classId;
    }

    public int getOUterClassId() {
        return classId;
    }

    class InnerClass{
        private String className;
        private int classId;

        InnerClass(String inClass, int inNumber) {
            this.className = inClass;
            this.classId = inNumber;
        }

        public String getClassName() {
            return className;
        }

        public int getClassId() {
            return classId;
        }

        private void outerClassAtrr() {
            System.out.println("ClassName: " + getOUterClassName());
            System.out.println("Access outer class variable: " + getOUterClassId());
        }
    }
}
