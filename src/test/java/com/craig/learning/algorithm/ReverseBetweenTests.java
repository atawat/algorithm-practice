package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.ListNode;

public class ReverseBetweenTests {
    ReverseBetween solution = new ReverseBetween();

    @Test
    void testReverseBetween() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        ListNode result = solution.reverseBetween(root, 2, 6);
        assertEquals(1, result.val);
        assertEquals(5, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(2, result.next.next.next.next.val);
    }

    @Test
    void testReverseBetween2() {
        ListNode root = new ListNode(5);

        ListNode result = solution.reverseBetween(root, 1, 1);
        assertEquals(5, result.val);
    }

    @Test
    void testReverseBetween3() {
        ListNode root = new ListNode(3);
        root.next = new ListNode(5);

        ListNode result = solution.reverseBetween(root, 1, 1);
        assertEquals(3, result.val);
        assertEquals(5, result.next.val);
    }
    
    @Test
    void testReverseBetween4() {
        ListNode root = new ListNode(3);
         root.next = new ListNode(5);

        ListNode result = solution.reverseBetween(root, 1, 2);
        assertEquals(5, result.val);
        assertEquals(3, result.next.val);
    }
}
