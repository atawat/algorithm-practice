package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CandyTests {
    Candy solution = new Candy();
    @Test
    void testCandy() {
        assertEquals(5, solution.candy(new int[]{1,0,2}));
    }
}
