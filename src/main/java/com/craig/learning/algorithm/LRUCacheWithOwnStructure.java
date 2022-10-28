package com.craig.learning.algorithm;

import java.util.HashMap;

public class LRUCacheWithOwnStructure<K, V> {
    ListNode<K, V> head;
    ListNode<K, V> tail;

    private int capacity;

    private int size = 0;

    private HashMap<K, ListNode<K, V>> cache = new HashMap<K, ListNode<K, V>>();

    public LRUCacheWithOwnStructure(int capacity) {
        this.capacity = capacity;
        head = new ListNode<K, V>(null, null);
        tail = new ListNode<K, V>(null, null);
    }

    public void put(K key, V value) {
        ListNode<K, V> node = cache.get(key);
        if (node == null) {
            if (size >= capacity) {
                removeLast();
            }
            node = new ListNode<K, V>(key, value);
            addAtHead(node);
            cache.put(key, node);
            size++;
        } else {
            removeNode(node);
            addAtHead(node);
            node.value = value;
        }
    }

    public V get(K key) {
        ListNode<K, V> node = cache.get(key);
        if (node == null) {
            return null;
        } else {
            removeNode(node);
            addAtHead(node);
            return node.value;
        }
    }

    private void removeLast() {
        ListNode<K, V> last = tail.prev;
        cache.remove(last.key);
        last.prev.next = tail;
        tail.prev = last.prev;
        size--;
    }

    private void removeNode(ListNode<K, V> node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
    }

    private void addAtHead(ListNode<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;

    }
}

class ListNode<K, T> {
    T value;
    K key;
    ListNode<K, T> next;
    ListNode<K, T> prev;

    public ListNode(K key, T value) {
        this.value = value;
        this.key = key;
    }
}