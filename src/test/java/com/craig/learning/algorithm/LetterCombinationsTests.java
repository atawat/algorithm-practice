package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LetterCombinationsTests {
    LetterCombinations solution = new LetterCombinations();

    @Test
    void testLetterCombinations() {
        List<String> result = solution.letterCombinations("23");
        assertEquals(9, result.size());
    }

    
    @Test
    void testLetterCombinations2() {
        List<String> result = solution.letterCombinations("");
        assertEquals(0, result.size());
    }

    @Test
    void testLetterCombinations3() {
        List<String> result = solution.letterCombinations("2");
        assertEquals(3, result.size());
    }
}
