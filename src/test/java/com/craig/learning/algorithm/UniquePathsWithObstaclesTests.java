package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UniquePathsWithObstaclesTests {

    UniquePathsWithObstacles solution = new UniquePathsWithObstacles();

    @Test
    void testUniquePathsWithObstacles() {
        int[][] ob = new int[][]{ new int[]{1}};
        assertEquals(0, solution.uniquePathsWithObstacles(ob)); 
    }
}
