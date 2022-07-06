package com.craig.learning.algorithm;

import com.craig.structure.Node;

/**
 * 霍夫曼树解码
 * https://www.hackerrank.com/challenges/tree-huffman-decoding/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
 */
public class HuffmanTree {

    public void decode(String s, Node<Character> root) {
        StringBuilder sb = new StringBuilder();
        Node<Character> temp = root;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                temp = temp.left;
            }else {
                temp = temp.right;
            }
            if(temp.left == null && temp.right == null){
                sb.append(temp.data);
                temp = root;
                continue;
            }
        }
        System.out.println(sb.toString());
    }
}
