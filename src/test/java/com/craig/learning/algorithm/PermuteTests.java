package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PermuteTests {
    Permute solution = new Permute();

    @Test
    void testPermute() {
        List<List<Integer>> result = solution.permute(new int[]{1,2,3});

        assertEquals(6, result.size());
    }
}
