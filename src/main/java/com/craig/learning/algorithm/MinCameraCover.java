package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 监控二叉树
 * https://leetcode.cn/problems/binary-tree-cameras/
 */
public class MinCameraCover {
    private int count = 0;

    public int minCameraCover(TreeNode root) {
        determined(root);

        if (root.val == 0) {
            // 根没有被覆盖
            count++;
        }

        return count;
    }

    private void determined(TreeNode root) {
        if (root.left == null && root.right == null) {
            // 叶子节点不用放
            return;
        }
        boolean childrenCoverd = true;
        boolean childrenSetCamera = false;
        if (root.left != null) {
            determined(root.left);
            if (root.left.val == 0) {
                childrenCoverd = false;
            } else if (root.left.val == 1) {
                childrenCoverd = true;
            } else if (root.left.val == 2) {
                childrenCoverd = true;
                childrenSetCamera = true;
            }
        }

        if (root.right != null) {
            determined(root.right);
            if (root.right.val == 0) {
                childrenCoverd = false;
            } else if (root.right.val == 1) {
                childrenCoverd &= true;
            } else if (root.right.val == 2) {
                childrenCoverd &= true;
                childrenSetCamera = true;
            }
        }

        if (childrenCoverd && childrenSetCamera) {
            // 自己被覆盖了
            root.val = 1;
        } else if (childrenCoverd && !childrenSetCamera) {
            // 交给上级来设置
            root.val = 0;
        } else if (!childrenCoverd) {
            // 子节点没有被cover，数量加1
            root.val = 2;
            count++;
        }
    }
}
