package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class WiggleSortTests {
    WiggleSort solution = new WiggleSort();

    @Test
    void testWiggleSort() {
        int[] source = new int[]{1,5,1,1,6,4} ;
        solution.wiggleSort(source);
        assertArrayEquals(new int[]{1,5,1,4,1,6}, source);
    }
}
