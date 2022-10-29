package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * 合并K个升序链表
 * https://leetcode.cn/problems/merge-k-sorted-lists/
 */
public class MergeKLists {

    //归并排序
    //采用分治的思想，基础题
    public ListNode mergeKLists(ListNode[] lists) {
        return recusiveMerge(lists, 0, lists.length - 1);
    }

    private ListNode recusiveMerge(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = (start + end) / 2;
        ListNode left = recusiveMerge(lists, start, mid);
        ListNode right = recusiveMerge(lists, mid + 1, end);
        return mergeList(left, right);
    }

    private ListNode mergeList(ListNode left, ListNode right) {
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
