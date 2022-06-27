package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FreqQueryTests {

    @Test
    void testFreqQuery() {
        List<List<Integer>> ops = new ArrayList<>() {
            {
                add(List.of(3, 4));
                add(List.of(2, 1003));
                add(List.of(1, 16));
                add(List.of(3, 1));
            }
        };
        List<Integer> result = FreqQuery.freqQuery(ops);

        assertEquals(2, result.size());
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testFreqQuery2() {
        List<List<Integer>> ops = new ArrayList<>() {
            {
                add(List.of(1, 5));
                add(List.of(1, 6));
                add(List.of(3, 2));
                add(List.of(1, 10));
                add(List.of(1, 10));
                add(List.of(1, 6));
                add(List.of(2, 5));
                add(List.of(3, 2));
            }
        };
        List<Integer> result = FreqQuery.freqQuery(ops);

        assertEquals(2, result.size());
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }
}
