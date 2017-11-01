package com.think.core.java.string;
import org.junit.Test;


import static org.junit.Assert.*;

public class AnagramCheckTest {
	
	@Test
    public void testIsAnagram() {
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.isAnagram("mary", "army"));
        assertTrue(AnagramCheck.isAnagram("stop", "tops"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));
       
    }
   
    @Test
    public void testIAnagram() {
        assertTrue(AnagramCheck.iAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.iAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.iAnagram("pure", "in"));
        assertFalse(AnagramCheck.iAnagram("fill", "fil"));
        assertTrue(AnagramCheck.iAnagram("a", "a"));
        assertFalse(AnagramCheck.iAnagram("b", "bbb"));
        assertFalse(AnagramCheck.iAnagram("ccc", "ccccccc"));
        assertFalse(AnagramCheck.iAnagram("sleep", "slep"));
       
    }
    
    @Test
    public void testcheckAnagram() {
        assertTrue(AnagramCheck.checkAnagram("word", "wrdo"));       
        assertFalse(AnagramCheck.checkAnagram("b", "bbb"));
        assertFalse(AnagramCheck.checkAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.checkAnagram("a", "a"));
        assertFalse(AnagramCheck.checkAnagram("sleep", "slep"));
        assertTrue(AnagramCheck.checkAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.checkAnagram("pure", "in"));
        assertFalse(AnagramCheck.checkAnagram("fill", "fil"));
       
    }

}
