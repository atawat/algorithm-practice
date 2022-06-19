package com.craig.learning.algorithm;

import com.craig.structure.Node;

/**
 * 排序的循环链表
 * https://leetcode.cn/problems/4ueAj6/
 */
public class LinkedListInsert {
    public Node insert(Node head, int insertVal) {
        Node newNode = new Node(insertVal);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node origin = head;
        Node next = null;
        Node pre = null;
        Node top = null;
        Node tail = null;
        Node originPre =null;

        do {
            if (head.val <= insertVal && (pre == null || pre.val <= head.val)) {
                pre = head;
            } else if (head.val > insertVal && (next == null || next.val > head.val)) {
                next = head;
            }
            if (head.val > head.next.val) {
                tail = head;
                top = head.next;
            }
            if(head.next == origin){
                originPre = head;
            }
            head = head.next;
        } while (head != origin);

        if (pre == null) {
            if(tail == null){
                tail = originPre;
            }
            pre = tail;
        }
        if (next == null) {
            if(top == null){
                top = pre.next;
            }
            next = top;
        }

        pre.next = newNode;
        newNode.next = next;

        return origin;
    }
}
