package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DuplicateZerosTests {
    DuplicateZeros solution = new DuplicateZeros();

    @Test
    void testDuplicateZeros(){
        int[] source = new int[]{1,0,2,3,0,4,5,0};
        solution.duplicateZeros(source);
        assertArrayEquals(new int[]{1,0,0,2,3,0,0,4},source);
    }

    @Test
    void testDuplicateZeros2(){
        int[] source = new int[]{0,1,7,6,0,2,0,7};
        solution.duplicateZeros(source);
        assertArrayEquals(new int[]{0,0,1,7,6,0,0,2},source);
    }
}
