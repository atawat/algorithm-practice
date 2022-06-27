package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibTests {
    Fib solution = new Fib();
    @Test
    void testFib() {
        assertEquals(3, solution.fib(4)); 
    }
}
