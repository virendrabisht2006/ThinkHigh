package com.think.core.java;

/**
 * Created by esha on 23/09/16.
 */
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;


public class LRUCacheTest {

    private LRUCache c;

    public LRUCacheTest() {
        this.c = new LRUCache(2);
    }

    @Test
    public void testACacheStartsEmpty() {
        assertEquals(c.get("1"), null);
        System.out.println("###1");
        System.out.println(c);
    }

    @Test
    public void testBSetBelowCapacity() {
        c.put("1","1");
        c.put("2","2");
        assertEquals(2, c.getCache().size());

    }

    @Test
    public void testCCapacityReachedOldestRemoved() {
        c = new LRUCache(2);
        c.put("1","1");
        c.put("2","2");
        c.put("3","3");
        System.out.println(c.getCache());
        assertEquals(2, c.getCache().size());

        assertEquals(c.get("1"), null);

    }

    @Test
    public void testDGetRenewsEntry() {
        c = new LRUCache(2);
        c.put("1","1");
        c.put("2","2");
        c.put("3","3");
        System.out.println(c.get("2"));
        c.put("4","4");
        assertEquals(c.get("3"), null);
        assertEquals(c.get("2"),"2");

    }
}
