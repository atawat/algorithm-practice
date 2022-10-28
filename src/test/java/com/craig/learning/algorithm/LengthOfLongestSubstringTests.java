package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LengthOfLongestSubstringTests {
    @Test
    void testLengthOfLongestSubstring() {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb")); 
    }
}
