package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTests {
    LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void testLongestCommonSubsequence() {
        String a ="aaaaaaaaaaa";
        String b ="aaaaaaaaaaa";

        assertEquals(a.length(), solution.longestCommonSubsequence(a, b)); 
    }


    @Test
    void testLongestCommonSubsequence1() {
        String a ="aaaaaaaaaaa";
        String b ="a";

        assertEquals(1, solution.longestCommonSubsequence(a, b)); 
    }    
    
    @Test
    void testLongestCommonSubsequence2() {
        String a ="abcde";
        String b ="ace";

        assertEquals(3, solution.longestCommonSubsequence(a, b)); 
    }

    @Test
    void testLongestCommonSubsequence3() {
        String a ="abc";
        String b ="def";

        assertEquals(0, solution.longestCommonSubsequence(a, b)); 
    }    
    
    @Test
    void testLongestCommonSubsequence4() {
        String a ="HARRY";
        String b ="SALLY";

        assertEquals(2, solution.longestCommonSubsequence(a, b)); 
    }
}
