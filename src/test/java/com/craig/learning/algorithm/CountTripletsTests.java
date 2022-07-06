package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CountTripletsTests {
    CountTriplets solution = new CountTriplets();

    @Test
    void testCountTriplets() {
        assertEquals(4L, solution.countTriplets(Arrays.asList(1L, 5L, 5L, 125L, 25L), 5L));
    }

    @Test
    void testCountTriplets2() {
        assertEquals(2L, solution.countTriplets(Arrays.asList(1L, 1L, 1L, 5L, 5L, 5L), 1L));
    }

    @Test
    void testCountTriplets3() {
        assertEquals(161700L, solution.countTriplets(Arrays.asList(1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,
        1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L), 1L));
    }
}
