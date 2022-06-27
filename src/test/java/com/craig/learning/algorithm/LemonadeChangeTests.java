package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LemonadeChangeTests {
    LemonadeChange solution = new LemonadeChange();
    @Test
    void testLemonadeChange() {
        assertTrue(solution.lemonadeChange(new int[]{5,5,5,10,20}));
    }

    @Test
    void testLemonadeChange1() {
        assertFalse(solution.lemonadeChange(new int[]{5,5,10,10,20}));
    }

    
    @Test
    void testLemonadeChange2() {
        assertFalse(solution.lemonadeChange(new int[]{5,5,5,20,20}));
    }
}
