package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.craig.structure.ListNode;

import org.junit.jupiter.api.Test;

public class ReverseListTests {
    ReverseList solution = new ReverseList();

    @Test
    void testReverseList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newNode = solution.reverseList(node1);

        assertEquals(4, newNode.val);
        assertEquals(3, newNode.next.val);
        assertEquals(2, newNode.next.next.val);
        assertEquals(1, newNode.next.next.next.val);
    }
}
