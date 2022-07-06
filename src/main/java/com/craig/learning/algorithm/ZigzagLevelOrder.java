package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.craig.structure.TreeNode;

/**
 * 二叉树的锯齿形层序遍历
 * https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/
 */
public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(root);

        boolean pivot = true;
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();

                if(!pivot)
                    layer.add(0,node.val);
                else
                    layer.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            pivot = !pivot;

            result.add(layer);
        }

        return result;
    }
}
