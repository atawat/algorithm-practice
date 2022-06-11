package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateTests {
    private Calculate calculate = new Calculate();

    @Test
    void testCalculate() {
        // assertEquals(22, calculate.calculate("11+11"));
        // assertEquals(1, calculate.calculate("11-(8+2)"));
        // assertEquals(17, calculate.calculate("11-(-8+2)"));
        // assertEquals(33, calculate.calculate("11-(-8+2)*(-5+8)+8/2"));
        // assertEquals(2, calculate.calculate("1 + 1"));
        // assertEquals(23, calculate.calculate("(1+(4+5+2)-3)+(6+8)"));
        // assertEquals(-23, calculate.calculate("-((1+(4+5+2)-3)+(6+8))"));
        assertEquals(-12, calculate.calculate("- (3 - (- (4 + 5) ) )"));
    }
}
