package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxUncrossedLinesTests {
    MaxUncrossedLines solution = new MaxUncrossedLines();
    @Test
    void testMaxUncrossedLines() {
        assertEquals(2, solution.maxUncrossedLines(new int[]{1,4,2}, new int[]{1,2,4})); ;
    }
}
