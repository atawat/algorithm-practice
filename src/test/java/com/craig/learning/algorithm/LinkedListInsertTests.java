package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.Node;

public class LinkedListInsertTests {
    LinkedListInsert solution = new LinkedListInsert();

    @Test
    void testInsert() {
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = head;
        Node result = solution.insert(head, 2);

        assertEquals(head, result);
    }
}
