package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * 环型链表找入口
 * https://leetcode.cn/problems/linked-list-cycle-ii/
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do{
            if(fast.next == null){
                fast = fast.next;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }while(fast!= null && slow != null && fast != slow);
        if(fast == null || slow == null){
            return null;
        }

        ListNode start = head;
        while (start != slow){
            start = start.next;
            slow = slow.next;
        }

        return slow;
    }
}
