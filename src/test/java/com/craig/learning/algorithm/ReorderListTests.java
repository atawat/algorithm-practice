package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.ListNode;

public class ReorderListTests {
    ReorderList solution = new ReorderList();

    @Test
    void testReorderList() {
        ListNode root = new ListNode(1);
        ListNode temp = root;
        for (int i = 1; i <= 4; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }

        solution.reorderList(root);

        assertEquals(1, root.val);
        assertEquals(5, root.next.val);
        assertEquals(2, root.next.next.val);
        assertEquals(4, root.next.next.next.val);
        assertEquals(3, root.next.next.next.next.val);
    }

    @Test
    void testReorderList1() {
        ListNode root = new ListNode(1);
        ListNode temp = root;
        for (int i = 1; i <= 3; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }

        solution.reorderList(root);

        assertEquals(1, root.val);
        assertEquals(4, root.next.val);
        assertEquals(2, root.next.next.val);
        assertEquals(3, root.next.next.next.val);
    }
}
