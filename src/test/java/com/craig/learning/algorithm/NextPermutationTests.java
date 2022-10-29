package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class NextPermutationTests {
    NextPermutation solution = new NextPermutation();

    @Test
    void testNextPermutation0() {
        int[] param2 = new int[] { 2, 3, 1 };
        solution.nextPermutation(param2);
        assertArrayEquals(new int[] { 3, 1, 2 }, param2);
    }

    @Test
    void testNextPermutation1() {

        int[] param = new int[] { 1, 2, 5, 7, 4, 2, 9, 8, 3 };
        solution.nextPermutation(param);
        assertArrayEquals(new int[] { 1, 2, 5, 7, 4, 3, 2, 8, 9 }, param);
    }

    @Test
    void testNextPermutation2() {
        NextPermutation solution = new NextPermutation();
        int[] param2 = new int[] { 3, 2, 1 };
        solution.nextPermutation(param2);
        assertArrayEquals(new int[] { 1, 2, 3 }, param2);
    }

    @Test
    void testNextPermutation3() {
        NextPermutation solution = new NextPermutation();
        int[] param2 = new int[] { 4, 2, 0, 2, 3, 2, 0 };
        solution.nextPermutation(param2);
        assertArrayEquals(new int[] { 4, 2, 0, 3, 0, 2, 2 }, param2);
    }

    @Test
    void testNextPermutation4() {
        NextPermutation solution = new NextPermutation();
        int[] param2 = new int[] { 5,1,1 };
        solution.nextPermutation(param2);
        assertArrayEquals(new int[] {1,1,5 }, param2);
    }
}
