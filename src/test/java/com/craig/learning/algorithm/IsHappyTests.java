package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsHappyTests {
    IsHappy solution = new IsHappy();

    @Test
    void testIsHappy() {
        assertEquals(true, solution.isHappy(19));
        assertEquals(false, solution.isHappy(2));
    }
}
