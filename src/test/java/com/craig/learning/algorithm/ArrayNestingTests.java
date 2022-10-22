package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayNestingTests {
    ArrayNesting solution = new ArrayNesting();
    @Test
    void testArrayNesting() {
        assertEquals(4, solution.arrayNesting(new int[]{5,4,0,3,1,6,2})); 
    }    
    
    @Test
    void testArrayNesting2() {
        assertEquals(2, solution.arrayNesting(new int[]{1,0})); 
    }
}
