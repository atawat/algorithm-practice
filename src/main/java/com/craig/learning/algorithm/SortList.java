package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * https://leetcode.cn/problems/sort-list/
 * 148. 排序链表
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;

        return mergeSortedList(sortList(head), sortList(right));
    }

    private ListNode mergeSortedList(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if (left != null) {
            temp.next = left;
        } else if (right != null) {
            temp.next = right;
        }
        return head.next;
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
