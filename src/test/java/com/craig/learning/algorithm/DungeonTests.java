package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DungeonTests {
    Dungeon solution = new Dungeon();
    @Test
    void testSolverDd() {
        int[][] dungeon = new int[][]{
            new int[]{-2,-3,3},
            new int[]{-5,-10,1},
            new int[]{0,30,-5}
        };
        assertEquals(7, solution.solverDd(dungeon));
    }
}
