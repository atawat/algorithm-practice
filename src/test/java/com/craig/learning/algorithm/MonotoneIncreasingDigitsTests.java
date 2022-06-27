package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MonotoneIncreasingDigitsTests {
    MonotoneIncreasingDigits solution = new MonotoneIncreasingDigits();

    @Test
    void testMonotoneIncreasingDigits() {
        assertEquals(1234, solution.monotoneIncreasingDigits(1234)); 
    }

    @Test
    void testMonotoneIncreasingDigits1() {
        assertEquals(1999, solution.monotoneIncreasingDigits(2048)); 
    }

    @Test
    void testMonotoneIncreasingDigits2() {
        assertEquals(18999, solution.monotoneIncreasingDigits(19996)); 
    }

    @Test
    void testMonotoneIncreasingDigits3() {
        assertEquals(667999, solution.monotoneIncreasingDigits(668841)); 
    }   
    
    @Test
    void testMonotoneIncreasingDigits4() {
        assertEquals(299, solution.monotoneIncreasingDigits(332)); 
    }
}
