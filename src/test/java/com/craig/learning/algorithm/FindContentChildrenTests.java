package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindContentChildrenTests {
    FindContentChildren solution = new FindContentChildren();

    @Test
    void testFindContentChildren() {
        assertEquals(2, solution.findContentChildren(new int[]{1,2}, new int[]{1,2,3})); 
    }
}
