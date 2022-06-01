package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.craig.structure.ListNode;

import org.junit.jupiter.api.Test;

public class GetIntersectionNodeTests {

    GetIntersectionNode solution = new GetIntersectionNode();

    @Test
    void testGetIntersectionNode() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode nodeA = new ListNode(11);
        ListNode nodeB = new ListNode(12);
        nodeA.next = nodeB;
        nodeB.next = node4;

        ListNode commonNode = solution.getIntersectionNode(node1, nodeA);

        assertEquals(node4, commonNode);
    }
}
