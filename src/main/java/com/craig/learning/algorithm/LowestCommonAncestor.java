package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 二叉树的最近公共祖先
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class LowestCommonAncestor {
    //条件太多 不对
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if (root == p || root == q) {
    //         return root;
    //     }
    //     TreeNode leftNode = retriveTree(root.left, p, q);
    //     if (leftNode == null) {
    //         return retriveTree(root.right, p, q);
    //     }
    //     TreeNode rightNode;
    //     if (leftNode == p) {
    //         rightNode = retriveTree(root.right, q, null);
    //     } else if (leftNode == q) {
    //         rightNode = retriveTree(root.right, p, null);
    //     } else {
    //         return leftNode;
    //     }
    //     if (rightNode == null)
    //         return leftNode;
    //     return root;
    // }

    // private TreeNode retriveTree(TreeNode root, TreeNode target1, TreeNode target2) {
    //     if (root == null) {
    //         return null;
    //     }
    //     TreeNode another = null;
    //     if (root == target1 || root == target2) {
    //         if (root.left == null && root.right == null) {
    //             return root;
    //         }
    //         if(target1 == null ||target2 == null){
    //             return root;
    //         }
    //         if (root == target1) {
    //             another = target2;
    //         } else {
    //             another = target1;
    //         }
    //     }

    //     TreeNode leftTarget;
    //     if (another == null) {
    //         leftTarget = retriveTree(root.left, target1, target2);
    //     } else {
    //         leftTarget = retriveTree(root.left, another, null);
    //     }
    //     if (leftTarget != null) {
    //         if (another != null) {
    //             return another;
    //         }
    //         if (leftTarget == target1) {
    //             another = target2;
    //         } else if (leftTarget == target2) {
    //             another = target1;
    //         }
    //     }

    //     TreeNode rightTarget;
    //     if (another != null) {
    //         rightTarget = retriveTree(root.right, another, null);
    //     } else {
    //         rightTarget = retriveTree(root.right, target1, target2);
    //     }

    //     if (another != null) {
    //         if (rightTarget != null)
    //             return root;
    //         if (leftTarget != null)
    //             return leftTarget;
    //         return root;
    //     }

    //     return rightTarget;
    // }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) { // 递归结束条件
            return root;
        }

        // 后序遍历
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null && right == null) { // 若未找到节点 p 或 q
            return null;
        }else if(left == null && right != null) { // 若找到一个节点
            return right;
        }else if(left != null && right == null) { // 若找到一个节点
            return left;
        }else { // 若找到两个节点
            return root;
        }
    }

    /**
     * BST 公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestorInBst(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) { // 递归结束条件
            return root;
        }

        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}
