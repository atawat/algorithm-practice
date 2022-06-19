package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SolveNQueensTests {
    SolveNQueens solution = new SolveNQueens();

    @Test
    void testSolveNQueens() {
       List<List<String>> result =  solution.solveNQueens(4);

       assertEquals(2, result.size());
    }
}
