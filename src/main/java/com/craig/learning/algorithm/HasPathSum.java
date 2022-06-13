package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.craig.structure.TreeNode;

/**
 * 路径总和
 * https://leetcode.cn/problems/path-sum/
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Integer result = retriveSum(root, targetSum);
        return result != null && result == targetSum;
    }

    private Integer retriveSum(TreeNode node, int target) {
        if (node.left == null && node.right == null) {
            if (node.val == target)
                // 叶子节点
                return node.val;
            else
                return null;
        }
        int need = target - node.val;
        if (node.left != null) {
            Integer leftNum = retriveSum(node.left, need);
            if (leftNum != null && leftNum == need) {
                return target;
            }
        }
        if (node.right != null) {
            Integer rightNum = retriveSum(node.right, need);
            if (rightNum != null && rightNum == need) {
                return target;
            }
        }

        return null;
    }

    /**
     * 路径总和 II
     * https://leetcode.cn/problems/path-sum-ii/
     * @param root
     * @param targetSum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return Collections.emptyList();
        }
        return retriveSumPath(root, targetSum);
    }

    private List<List<Integer>> retriveSumPath(TreeNode node, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (node.left == null && node.right == null) {
            if (node.val == target) {
                // 叶子节点
                result.add(new ArrayList<>() {
                    {
                        add(node.val);
                    }
                });
            } 
            return result;
        }
        int need = target - node.val;
        if (node.left != null) {
            List<List<Integer>> leftPath = retriveSumPath(node.left, need);

            for (List<Integer> path : leftPath) {
                path.add(0, node.val);
            }

            if(!leftPath.isEmpty())
                result.addAll(leftPath);
        }
        if (node.right != null) {
            List<List<Integer>> rightPath = retriveSumPath(node.right, need);

            for (List<Integer> path : rightPath) {
                path.add(0, node.val);
            }

            if(!rightPath.isEmpty())
                result.addAll(rightPath);
        }
        return result;
    }
}
