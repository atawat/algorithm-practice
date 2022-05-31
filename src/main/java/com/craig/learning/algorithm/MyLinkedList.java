package com.craig.learning.algorithm;

public class MyLinkedList {
    class LinkNode{
        LinkNode prev;
        LinkNode next;
        Integer val;

        public LinkNode(int val){
            this.val = val;
        }
    }

    LinkNode sentinel;

    int length = 0;

    public MyLinkedList() {
        this.sentinel = new LinkNode(-1);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }
    
    public int get(int index) {
        int val = -1;
        if(index >= length){
            return val;
        }

        LinkNode temp = sentinel.next;
        if(temp == sentinel){
            return val;
        }
        for(int i =0; i<= index;i++){
            if(i == index){
                 return temp.val;
            }
            temp = temp.next;
        }

        return val;
    }
    
    public void addAtHead(int val) {
        LinkNode node = new LinkNode(val);
        node.prev = sentinel;
        node.next = sentinel.next;
        sentinel.next = node;
        node.next.prev = node;
        length++;
    }
    
    public void addAtTail(int val) {
        LinkNode node = new LinkNode(val);
        node.prev = sentinel.prev;
        node.next = sentinel;
        sentinel.prev.next = node;
        sentinel.prev = node;
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > length){
            return;
        }

        LinkNode node = new LinkNode(val);
        if(index == length){
            addAtTail(val);
            return;
        }

        LinkNode temp = sentinel.next;
        for(int i =0; i<= index;i++){
            if(i == index){
                node.prev = temp.prev;
                node.next = temp;
                temp.prev.next = node;
                temp.prev = node;
                break;
            }
            temp = temp.next;
        }

        length++;
    }
    
    public void deleteAtIndex(int index) {
        if(index > length -1){
            return;
        }

        LinkNode temp = sentinel.next;
        for(int i =0; i<= index;i++){
            if(i == index){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                temp.next = null;
                temp.prev = null;
                break;
            }
            temp = temp.next;
        }

        length--;
    }
}
