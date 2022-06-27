package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumTreesTests {
    NumTrees solution = new NumTrees();

    @Test
    void testNumTrees() {
        assertEquals(5, solution.numTrees(3)); 
        assertEquals(14, solution.numTrees(4)); 
    }
}
