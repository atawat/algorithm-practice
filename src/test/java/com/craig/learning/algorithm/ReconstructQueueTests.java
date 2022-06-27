package com.craig.learning.algorithm;

import org.junit.jupiter.api.Test;

public class ReconstructQueueTests {
    ReconstructQueue solution = new ReconstructQueue();

    @Test
    void testReconstructQueue() {
        int[][] people = new int[][]{
            new int[]{7,0},
            new int[]{4,4},
            new int[]{7,1},
            new int[]{5,0},
            new int[]{6,1},
            new int[]{5,2}
        };
        int[][] result = solution.reconstructQueue(people);
    }
}
