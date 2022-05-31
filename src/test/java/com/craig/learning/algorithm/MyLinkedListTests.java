package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyLinkedListTests {
    @Test
    void testList() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        int val = obj.get(1);
        assertEquals(2, val);
        obj.deleteAtIndex(1);
        int val1 = obj.get(1);
        assertEquals(3, val1);

        int val3 = obj.get(3);
        assertEquals(-1, val3);


        obj.deleteAtIndex(3);

        obj.deleteAtIndex(0);
        int val4 = obj.get(0);
        assertEquals(3, val4);

        obj.deleteAtIndex(0);
        int val5 = obj.get(0);
        assertEquals(-1, val5);

        //["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get","get","deleteAtIndex","deleteAtIndex","get","deleteAtIndex","get"]
        //[[],             [1],         [3],       [1,2],       [1],  [1],            [1],  [3],  [3],            [0],            [0],    [0],            [0]]
    }
}
