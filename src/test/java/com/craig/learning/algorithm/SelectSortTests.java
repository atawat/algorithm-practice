package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SelectSortTests {
    Sort solution = new Sort();

    @Test
    void testSort() {
        int[] s = new int[] { 3, 2, 1, 4, 5, 6, 9, 7, 8 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, solution.selectSort(s));
    }

    @Test
    void testSort1() {
        int[] s = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, solution.selectSort(s));
    }   
    
    @Test
    void testSort2() {
        int[] s = new int[] {9,8,7,6,5,4,3,2,1 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, solution.selectSort(s));
    }
}
