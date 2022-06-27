package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CanJumpTests {
    CanJump solution = new CanJump();

    @Test
    void testCanJump() {
       assertTrue(solution.canJump(new int[]{2,3,1,1,4})); 

       assertFalse(solution.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void testCanJump1() {
       assertTrue(solution.canJump(new int[]{2,5,0,0})); 

    }

    @Test
    void testCanJump2() {
       assertTrue(solution.canJump(new int[]{5,9,3,2,1,0,2,3,3,1,0,0})); 

    }

    @Test
    void testCanJump3() {
       assertTrue(solution.canJump(new int[]{4,2,0,0,1,1,4,4,4,0,4,0})); 

    }
}
