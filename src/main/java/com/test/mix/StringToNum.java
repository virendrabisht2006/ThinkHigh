package com.test.mix;

/**
 * Created by esha on 21/03/16.
 */
public class StringToNum implements Comparable{

    private int count;

    private String value;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringToNum that = (StringToNum) o;

        if (count != that.count) return false;
        return value.equals(that.value);

    }

    @Override
    public int hashCode() {
        int result = count;
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StringToNum{" +
                "count=" + count +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        StringToNum stringToNum = (StringToNum)o;
        return this.getCount()-stringToNum.getCount();
    }
}
