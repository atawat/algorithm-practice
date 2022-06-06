package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsTests {
    ReverseWords solution = new ReverseWords();

    @Test
    void testReverseWords() {
        String s = "the sky is blue";
        assertEquals("blue is sky the", solution.reverseWords(s)); 
    }

    @Test
    void testReverseWords1() {
        String s = "  a    good     example         ";
        assertEquals("example good a", solution.reverseWords(s)); 
    }
}
