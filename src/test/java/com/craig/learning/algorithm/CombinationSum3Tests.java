package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class CombinationSum3Tests {
    CombinationSum3 solution = new CombinationSum3();

    @Test
    void testCombinationSum3() {
        List<List<Integer>> result = solution.combinationSum3(3, 9);

        assertEquals(3, result.size());
    
        boolean testResult = result.stream()
                                   .flatMap(c->c.stream().reduce((c1,c2)->c1+c2).stream())
                                   .allMatch(c->c==9);
        assertTrue(testResult);
    }


    @Test
    void testCombinationSum31() {
        List<List<Integer>> result = solution.combinationSum3(3, 7);

        assertEquals(1, result.size());
    
        boolean testResult = result.stream()
                                   .flatMap(c->c.stream().reduce((c1,c2)->c1+c2).stream())
                                   .allMatch(c->c==7);
        assertTrue(testResult);
    }

    @Test
    void testCombinationSum32() {
        List<List<Integer>> result = solution.combinationSum3(4, 1);

        assertEquals(0, result.size());
    
        boolean testResult = result.stream()
                                   .flatMap(c->c.stream().reduce((c1,c2)->c1+c2).stream())
                                   .allMatch(c->c==1);
        assertTrue(testResult);
    }

    @Test
    void testCombinationSum33() {
        List<List<Integer>> result = solution.combinationSum3(9, 45);

        assertEquals(1, result.size());
    
        boolean testResult = result.stream()
                                   .flatMap(c->c.stream().reduce((c1,c2)->c1+c2).stream())
                                   .allMatch(c->c==45);
        assertTrue(testResult);
    }
}
