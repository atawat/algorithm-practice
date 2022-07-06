package com.craig.learning.algorithm;

import org.junit.jupiter.api.Test;

import com.craig.structure.ListNode;

public class ReverseKGroupTests {
    ReverseKGroup solution = new ReverseKGroup();

    @Test
    void testReverseKGroup() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        solution.reverseKGroup(head, 2);
    }    
    
    @Test
    void testReverseKGroup1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        solution.reverseKGroup(head, 3);
    }
}
