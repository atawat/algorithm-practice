package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode newTail = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = newTail;
            newTail = head;
            head = temp;
        }

        return newTail;
    }
}
