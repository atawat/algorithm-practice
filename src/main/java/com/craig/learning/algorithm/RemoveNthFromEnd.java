package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * 删除链表的倒数第N个节点
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n <= 0) {
            return head;
        }

        ListNode sentinel = new ListNode();
        sentinel.next = head;
        ListNode fast = sentinel;
        ListNode slow = sentinel;
        while (fast.next != null) {
            fast = fast.next;
            if (n-- <= 0) {
                slow = slow.next;
            }
        }

        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return sentinel.next;
    }
}
