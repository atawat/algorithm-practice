package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * 两两交换链表中的节点
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode p = sentinel;
        ListNode c = head;
        while(p != null &&  c!= null  &&c.next != null){
            p.next = c.next;
            c.next = c.next.next;
            p.next.next = c;
            p = p.next.next;
            c = p.next;
        }


        return sentinel.next;
    }
}
