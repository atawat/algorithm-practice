package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyQueueTests {
    MyQueue myQueue = new MyQueue();

    @Test
    void testEmpty() {
        assertTrue(myQueue.empty());
        myQueue.push(1);
        assertFalse(myQueue.empty());
    }

    @Test
    void testPeek() {
        myQueue.push(1);
        assertEquals(1,  myQueue.peek());
    }

    @Test
    void testPop() {
        myQueue.push(1);
        assertEquals(1,  myQueue.pop());
        assertTrue(myQueue.empty());
    }

    @Test
    void testPush() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        assertEquals(1,  myQueue.pop());
        assertEquals(2,  myQueue.pop());
        assertEquals(3,  myQueue.pop());
    }
}
