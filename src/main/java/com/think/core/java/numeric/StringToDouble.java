package com.think.core.java.numeric;

import java.text.DecimalFormat;

/**
 * Created by esha on 22/03/17.
 */
public class StringToDouble {
    private static DecimalFormat df2 = null;

    public static void main(String[] args) {
        String str[] ={"99.358","1.10"};
        Double total = new Double(0);

        int maxSize =0; String strMAx =null;
        for(String number: str){
            maxSize = number.length(); strMAx =number;

            if(number.length()> maxSize){
                maxSize =number.length();
                strMAx = number;
            }
            total = total + Double.parseDouble(number);
        }

        int decimalPosition = maxSize - strMAx.indexOf('.');
        System.out.println(decimalPosition);

        StringBuffer stringBuffer = new StringBuffer(".");

        for(int i=0;i<decimalPosition;i++){
            stringBuffer.append("#");
        }
        df2 = new DecimalFormat(stringBuffer.toString());

        System.out.println("Total: "+df2.format(total));
    }
}
