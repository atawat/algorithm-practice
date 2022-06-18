package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FindSubSequencesTests {
    FindSubSequences solution = new FindSubSequences();

    @Test
    void testFindSubsequences() {
        List<List<Integer>> result = solution.findSubsequences(new int[]{1,2,3,4,5,6,7,8,9,10,1,1,1,1,1});

        assertEquals((1 <<10) -1 -10 + 5, result.size());
    }
}
