package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * https://leetcode.cn/problems/reverse-linked-list-ii/
 * 92. 反转链表 II
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;
        ListNode dumy = new ListNode();
        dumy.next = head;
        head = dumy;
        int i = 0;
        
        while (i != left-1 && head != null) {
            head = head.next;
            i++;
        }

        if (head == null || head.next == null) {
            return dumy.next;
        }

        ListNode leftLast =  head ;
        ListNode prev = null;
        ListNode cur = head.next;
        ListNode reverseLast = cur;


        while (cur != null && i < right) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            i++;
        }

        reverseLast.next = cur;
        leftLast.next = prev;

        return dumy.next;
    }
}
