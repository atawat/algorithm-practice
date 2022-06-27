package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SherlockAndAnagramsTests {
    @Test
    void testSherlockAndAnagrams() {
        assertEquals(4,  SherlockAndAnagrams.sherlockAndAnagrams("abba"));
    }    
    
    @Test
    void testSherlockAndAnagrams2() {
        assertEquals(5,  SherlockAndAnagrams.sherlockAndAnagrams("cdcd"));
    }        
    
    @Test
    void testSherlockAndAnagrams4() {
        assertEquals(0,  SherlockAndAnagrams.sherlockAndAnagrams("abcd"));
    }    
    
    @Test
    void testSherlockAndAnagrams3() {
        assertEquals(166650,  SherlockAndAnagrams.sherlockAndAnagrams("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }    
    
    @Test
    void testSherlockAndAnagrams5() {
        assertEquals(10,  SherlockAndAnagrams.sherlockAndAnagrams("kkkk"));
    }
}
