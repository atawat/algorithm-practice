package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyStackTests {
    MyStack stack = new MyStack();

    @Test
    public void testMyStack(){
        assertTrue(stack.empty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.top());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertFalse(stack.empty());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }
}
