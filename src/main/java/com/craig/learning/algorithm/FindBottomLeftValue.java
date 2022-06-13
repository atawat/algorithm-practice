package com.craig.learning.algorithm;

import java.util.LinkedList;
import java.util.Queue;

import com.craig.structure.TreeNode;

/**
 * 找树左下角的值
 * https://leetcode.cn/problems/find-bottom-left-tree-value/
 */
public class FindBottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Integer bottomLeftValue = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    bottomLeftValue = node.val;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    // 非叶子右节点入队
                    queue.offer(node.right);
                }
            }
        }
        return bottomLeftValue;
    }
}
