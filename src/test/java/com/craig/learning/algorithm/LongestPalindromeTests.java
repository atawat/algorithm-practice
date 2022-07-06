package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestPalindromeTests {
    LongestPalindrome solution = new LongestPalindrome();

    @Test
    void testLongestPalindrome() {
        String result = solution.longestPalindrome("babad");
        assertEquals(3, result.length());
    }    
    
    @Test
    void testLongestPalindrome2() {
        String result = solution.longestPalindrome("cbbd");
        assertEquals(2, result.length());
    }    
    
    @Test
    void testLongestPalindrome3() {
        String result = solution.longestPalindrome("abccbaabacbc");
        assertEquals(6, result.length());
    }    

    @Test
    void testLongestPalindrome4() {
        String result = solution.longestPalindrome("bb");
        assertEquals(2, result.length());
    }
}
