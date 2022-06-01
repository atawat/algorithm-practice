package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.craig.structure.ListNode;

import org.junit.jupiter.api.Test;

public class RemoveNthFromEndTests {
    RemoveNthFromEnd solution = new RemoveNthFromEnd();
    
    @Test
    void testRemoveNthFromEnd() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newNode = solution.removeNthFromEnd(node1, 2);
        assertEquals(1, newNode.val);
        assertEquals(2, newNode.next.val);
        assertEquals(3, newNode.next.next.val);
        assertEquals(5, newNode.next.next.next.val);
    }

    @Test
    void testRemoveNthFromEnd2() {
        ListNode node1 = new ListNode(1);

        ListNode newNode = solution.removeNthFromEnd(node1, 1);
        assertEquals(null, newNode);
    }

    @Test
    void testRemoveNthFromEnd3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newNode = solution.removeNthFromEnd(node1, 5);
        assertEquals(2, newNode.val);
        assertEquals(3, newNode.next.val);
        assertEquals(4, newNode.next.next.val);
        assertEquals(5, newNode.next.next.next.val);
    }
}
