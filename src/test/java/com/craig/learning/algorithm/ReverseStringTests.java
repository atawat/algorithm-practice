package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTests {
    ReverseString solution = new ReverseString();

    @Test
    void testReverseString() {
        char[] s = new char[]{'a','b','c'};
        solution.reverseString(s);

        assertArrayEquals(new char[]{'c','b','a'}, s);
    }

    @Test
    void testReverseString1() {
        char[] s = new char[]{'a','a','a','b','c','c','c'};
        solution.reverseString(s);

        assertArrayEquals(new char[]{'c','c','c','b','a','a','a'}, s);
    }

    @Test
    void testReverseStringII(){
        assertEquals("bacdfeg", solution.reverseStr("abcdefg", 2)); 
        assertEquals("bacd", solution.reverseStr("abcd", 2)); 
        assertEquals("gfedcba", solution.reverseStr("abcdefg", 8)); 
    }
}
