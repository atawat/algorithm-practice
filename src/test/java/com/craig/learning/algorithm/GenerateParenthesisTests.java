package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GenerateParenthesisTests {

    GenerateParenthesis solution = new GenerateParenthesis();
    @Test
    void testGenerateParenthesis() {
       List<String> result =  solution.generateParenthesis(3);
       assertEquals(result.size(), 5);
    }
}
