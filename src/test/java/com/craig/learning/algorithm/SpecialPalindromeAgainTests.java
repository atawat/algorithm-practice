package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpecialPalindromeAgainTests {
    SpecialPalindromeAgain solution  = new SpecialPalindromeAgain();

    @Test
    void testSubstrCount() {
        assertEquals(10, solution.substrCount(4, "aaaa")); 
    }

    @Test
    void testSubstrCount2() {
        assertEquals(10, solution.substrCount(7, "abcbaba")); 
    }

    @Test
    void testSubstrCount3() {
        assertEquals(7, solution.substrCount(5, "asasd")); 
    }
}
