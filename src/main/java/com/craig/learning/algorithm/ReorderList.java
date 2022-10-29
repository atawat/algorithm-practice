package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * https://leetcode.cn/problems/reorder-list/
 * 143. 重排链表
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode rightList = reverseList(mid.next);
        mid.next = null;
        mergeList(head, rightList);
    }

    private ListNode mergeList(ListNode head, ListNode rightList) {
        ListNode cur = head;
        ListNode next = rightList;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = next;
            cur = next;
            next = temp;
        }
        return head;
    }

    private ListNode reverseList(ListNode node) {
        ListNode cur = node;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

    private ListNode findMid(ListNode head) {
        ListNode low = head;
        ListNode quick = head;
        while (quick != null && quick.next != null && quick.next.next != null) {
            low = low.next;
            quick = quick.next.next;
        }
        return low;
    }
}
