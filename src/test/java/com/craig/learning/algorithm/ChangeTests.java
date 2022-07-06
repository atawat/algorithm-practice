package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChangeTests {
    Change solution = new Change();

    @Test
    void changeTest(){
        assertEquals(3, solution.change(5, new int[]{5,4,1})); 
    }
}
