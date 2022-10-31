package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstMissingPositiveTests {

    FirstMissingPositive solution = new FirstMissingPositive();

    @Test
    void testFirstMissingPositive() {
        assertEquals(3, solution.firstMissingPositive(new int[] {1,2,0}));
    }
}
