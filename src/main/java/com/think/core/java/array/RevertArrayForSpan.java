package com.think.core.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by esha on 20/02/17.
 */
public class RevertArrayForSpan {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12};

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<a.length;i++){
            list.add(a[i]);
        }

        System.out.println(list);

        // Collections.reverse(list.subList(0, 1));

       // Collections.reverse(list.subList(1, 3));

       // Collections.reverse(list.subList(3, 6));

       // Collections.reverse(list.subList(6, 8));

      //  System.out.println(list);
        System.out.println(a.length);

        int lastRevertIndex =0;
        int spanToReverse = 1;
        int to =1;
        while(to <= a.length){
            Collections.reverse(list.subList(lastRevertIndex, to));
            lastRevertIndex = to;
            spanToReverse = spanToReverse + 1;
            to = lastRevertIndex + spanToReverse;

            if(to > a.length && !(lastRevertIndex>=a.length)){
                to = a.length;
            }
        }

        System.out.println(list);
    }

}
