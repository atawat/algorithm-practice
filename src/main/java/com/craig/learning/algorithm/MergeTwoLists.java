package com.craig.learning.algorithm;

import com.craig.structure.ListNode;
/**
 * https://leetcode.cn/problems/merge-two-sorted-lists/
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode left, ListNode right) {
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
}
