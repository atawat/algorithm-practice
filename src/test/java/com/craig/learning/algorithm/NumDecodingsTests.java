package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumDecodingsTests {
    NumDecodings solution = new NumDecodings();
    @Test
    void testNumDecodings() {
        assertEquals(2, solution.numDecodings("12"));
    }    
    
    @Test
    void testNumDecodings2() {
        assertEquals(0, solution.numDecodings("06"));
    }   

    @Test
    void testNumDecodings3() {
        assertEquals(1, solution.numDecodings("2101"));
    }

    @Test
    void testNumDecodings4() {
        assertEquals(4, solution.numDecodings("2611055971756562"));
    }
}
