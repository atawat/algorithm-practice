package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.craig.structure.ListNode;

import org.junit.jupiter.api.Test;

public class SwapPairsTests {
    SwapPairs solution = new SwapPairs();

    @Test
    void testSwapPairs() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newList = solution.swapPairs(node1);
        assertEquals(2, newList.val);
        assertEquals(1, newList.next.val);
        assertEquals(4, newList.next.next.val);
        assertEquals(3, newList.next.next.next.val);
        assertEquals(5, newList.next.next.next.next.val);
    }

    @Test
    void testSwapPairs2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newList = solution.swapPairs(node1);
        assertEquals(2, newList.val);
        assertEquals(1, newList.next.val);
        assertEquals(4, newList.next.next.val);
        assertEquals(3, newList.next.next.next.val);
        assertEquals(null, newList.next.next.next.next);
    }
}
