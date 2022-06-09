package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveAllAdjacentDuplicatesStringTests {
    RemoveAllAdjacentDuplicatesString solution = new RemoveAllAdjacentDuplicatesString();
    @Test
    void testRemoveDuplicates() {
        assertEquals("ca", solution.removeDuplicates("abbaca"));
    }
}
