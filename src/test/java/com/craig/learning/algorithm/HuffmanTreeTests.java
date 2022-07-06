package com.craig.learning.algorithm;

import org.junit.jupiter.api.Test;

import com.craig.structure.Node;

public class HuffmanTreeTests {
    HuffmanTree solution = new HuffmanTree();

    @Test
    void testDecode() {
        Node<Character> root = new Node<Character>(5);
        root.left = new Node<>(2);
        root.right = new Node<>(3,'A');

        root.left.left = new Node<>(1,'B');
        root.left.right = new Node<>(1,'C');

        solution.decode("1001011", root);
    }
}
