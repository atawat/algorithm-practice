package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LetterCasePermutationTests {
    LetterCasePermutation solution = new LetterCasePermutation();
    
    @Test
    void testLetterCasePermutation() {
        List<String> resut = solution.letterCasePermutation("a1b2");
        assertEquals(4, resut.size());
    }

    @Test
    void testLetterCasePermutation2() {
        List<String> resut = solution.letterCasePermutation("3z4");
        assertEquals(2, resut.size());
    }
}
