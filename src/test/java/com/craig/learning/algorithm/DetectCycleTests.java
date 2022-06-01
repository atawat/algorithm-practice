package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.craig.structure.ListNode;

import org.junit.jupiter.api.Test;

public class DetectCycleTests {

    DetectCycle solution = new DetectCycle();

    @Test
    void testDetectCycle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node5.next = node2;

        ListNode entry = solution.detectCycle(node1);
        assertEquals(node2, entry);
    }
}
