package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.craig.structure.ListNode;

public class SortListTests {
    SortList solution = new SortList();
    @Test
    void testSortList() {
        ListNode node = new com.craig.structure.ListNode(4);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(3);
        //node.next.next = new ListNode(2);
        ListNode result = solution.sortList(node);
        int val = result.val;
        result = result.next;
        while (result != null) {
            assertTrue(result.val > val);
            val = result.val;
            result = result.next;
        }
    }

    @Test
    void testSortList1() {
        ListNode node = new com.craig.structure.ListNode(4);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(5);

        ListNode result = solution.sortList(node);
        int val = result.val;
        result = result.next;
        while (result != null) {
            assertTrue(result.val > val);
            val = result.val;
            result = result.next;
        }
    }
}
