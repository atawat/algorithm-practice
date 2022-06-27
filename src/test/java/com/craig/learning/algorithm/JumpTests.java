package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpTests {

    Jump solution = new Jump();
    
    @Test
    void testJump() {
       assertEquals(2, solution.jump(new int[]{2,3,1,1,4})); 

       assertEquals(-1,solution.jump(new int[]{3,2,1,0,4}));
    }

    @Test
    void testJump1() {
        assertEquals(2, solution.jump(new int[]{2,5,0,0})); 

    }

    @Test
    void testJump2() {
        assertEquals(3, solution.jump(new int[]{5,9,3,2,1,0,2,3,3,1,0,0})); 

    }

    @Test
    void testJump3() {
        assertEquals(5, solution.jump(new int[]{4,2,0,0,1,1,4,4,4,0,4,0})); 

    }

    @Test
    void testJump4() {
        assertEquals(1, solution.jump(new int[]{1,2})); 

    }
}
