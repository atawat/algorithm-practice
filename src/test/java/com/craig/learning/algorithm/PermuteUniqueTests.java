package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermuteUniqueTests {
    PermuteUnique solution = new PermuteUnique();

    @Test
    void testPermuteUnique() {
        assertEquals(3, solution.permuteUnique(new int[]{1,1,2}).size()); ;
    }
}
