package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsValidTests {
    IsValid solution = new IsValid();

    @Test
    void testIsValid() {
        String s = "[]{}()";

        assertTrue(solution.isValid(s)); 
        assertTrue(solution.isValid("{[]}")); 
        assertFalse(solution.isValid("{[])")); 
        assertFalse(solution.isValid("{")); 
        assertFalse(solution.isValid("{}[")); 
    }
}
