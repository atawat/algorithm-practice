package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PartitionTests {
    Partition solution = new Partition();

    @Test
    void testPartition() {
        List<List<String>> result = solution.partition("aab");
        assertEquals(2, result.size());
        assertEquals(3, result.get(0).size());
        assertEquals(2, result.get(1).size());
    }
}
