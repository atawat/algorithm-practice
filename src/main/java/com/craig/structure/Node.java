package com.craig.structure;

public class Node<E> {
    public int val;
    public Node<E> left;
    public Node<E> right;
    public Node<E> next;
    public E data;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val ,E data) {
        this.val = val;
        this.data = data;
    }

    public Node(int val, Node<E> left, Node<E> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
