package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CanConstructTests {
    CanConstruct solution = new CanConstruct();
    @Test
    void testCanConstruct() {
        assertFalse(solution.canConstruct("a", "b"));
        assertFalse(solution.canConstruct("aa", "bb"));
        assertTrue(solution.canConstruct("aa", "aab"));
    }
}
