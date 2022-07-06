package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * K 个一组翻转链表
 * https://leetcode.cn/problems/reverse-nodes-in-k-group/
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode dumyHead = new ListNode();
        dumyHead.next = head;
        ListNode temp = dumyHead.next;
        ListNode prev = dumyHead;
        while (temp != null) {
            if(!checkCount(temp, k)){
                break;
            }
            ListNode groupLast = reverseList(temp, k, prev);
            temp = groupLast.next;
            prev = groupLast;
        }

        return dumyHead.next;
    }

    private ListNode reverseList(ListNode head, int k, ListNode prev) {

        ListNode newTail = null;
        ListNode temp = null;
        ListNode originHead = head;
        while(head != null && k != 0){
            temp = head.next;
            head.next = newTail;
            newTail = head;
            head = temp;
            k--;
        }
        prev.next = newTail;
        originHead.next = temp;
        return originHead;
    }

    private boolean checkCount(ListNode head, int k){
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if(temp == null){
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}
