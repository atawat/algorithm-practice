package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReachANumberTests {
    ReachANumber solution = new ReachANumber();

    @Test
    void testReachNumber() {
        assertEquals(2, solution.reachNumber(3));
    }
    
    @Test
    void testReachNumber2() {
        assertEquals(3, solution.reachNumber(2));
    }
    
    @Test
    void testReachNumber3() {
        assertEquals(15, solution.reachNumber(100)); 
    }
}
