package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MaxConcatenatedLengthTests {
    MaxConcatenatedLength solution = new MaxConcatenatedLength();

    @Test
    void testMaxLength() {
        List<String> s = new ArrayList<>(){{
            add("un");
            add("iq");
            add("ue");
        }};
        assertEquals(4, solution.maxLength(s)); 
    }

    @Test
    void testMaxLength1() {
        List<String> s = new ArrayList<>(){{
            add("a");
            add("c");
            add("bcd");
            add("de");
        }};
        assertEquals(4, solution.maxLength(s)); 
    }
    
    @Test
    void testMaxLength2() {
        List<String> s = new ArrayList<>(){{
            add("ab");
            add("cd");
            add("cde");
            add("efg");
            add("fgh");
            add("cdef");
            add("abxyz");
        }};
        assertEquals(11, solution.maxLength(s)); 
    }
}
