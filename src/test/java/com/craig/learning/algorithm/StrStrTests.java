package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StrStrTests {
    StrStr solution = new StrStr();

    @Test
    void testStrStr() {
        assertEquals(2, solution.strStr("hello", "ll"));     
        assertEquals(-1, solution.strStr("aaaa", "all"));     
        assertEquals(4, solution.strStr("mississippi","issip"));     
        assertEquals(9, solution.strStr("mississippi","pi"));     
    }


    
    @Test
    void testStrStr2() {
        assertEquals(2, solution.strStr2("hello", "ll"));     
        assertEquals(-1, solution.strStr2("aaaa", "all"));     
        assertEquals(4, solution.strStr2("mississippi","issip"));     
        assertEquals(9, solution.strStr2("mississippi","pi"));     
        assertEquals(13, solution.strStr2("bacbababaabcbababaca","ababaca"));     
    }
}
