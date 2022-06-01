package com.craig.learning.algorithm;

import com.craig.structure.ListNode;

/**
 * 相交链表
 * https://leetcode.cn/problems/intersection-of-two-linked-lists/
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count = 1;
        ListNode pA = headA;
        ListNode pB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (lengthA == 0 || lengthB == 0 ) {
            
            if (pA.next == null && lengthA == 0) {
                lengthA = count;
            }
            if (pA.next != null){
                pA = pA.next;
            }
            if (pB.next == null && lengthB == 0) {
                lengthB = count;
            } 
            if ( pB.next != null){
                pB = pB.next;
            }
            
           
            count++;
        }

        int gap = Math.abs(lengthA - lengthB);
        ListNode pH;
        ListNode pL;
        if (lengthA > lengthB) {
            pH = headA;
            pL = headB;
        } else {
            pH = headB;
            pL = headA;
        }
        for (int i = 0; i < gap; i++) {
            pH = pH.next;
        }

        while (pH != pL) {
            pH = pH.next;
            pL = pL.next;
        }

        return pH;
    }
}
