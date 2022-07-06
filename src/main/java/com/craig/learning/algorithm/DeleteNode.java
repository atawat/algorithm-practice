package com.craig.learning.algorithm;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;

import com.craig.structure.TreeNode;

/**
 * 删除二叉搜索树中的节点
 * https://leetcode.cn/problems/delete-node-in-a-bst/
 */
public class DeleteNode {

    // 比较笨
    // public TreeNode deleteNode(TreeNode root, int key) {
    // TreeNode temp = root;
    // TreeNode pre = null;
    // while (temp != null && temp.val != key) {
    // pre = temp;
    // if (key > temp.val) {
    // temp = temp.right;
    // } else if (key < temp.val) {
    // temp = temp.left;
    // }
    // }
    // if (temp == null) {
    // return root;
    // }
    // TreeNode newNode;
    // if (temp.right == null && temp.left == null) {
    // newNode = null;
    // } else if (temp.right != null) {
    // newNode = cutMinNode(temp.right, temp);
    // newNode.left = temp.left;
    // newNode.right = temp.right;
    // } else {
    // newNode = cutMaxNode(temp.left, temp);
    // newNode.left = temp.left;
    // newNode.right = temp.right;
    // }

    // if(pre != null){
    // if (pre.left == temp) {
    // pre.left = newNode;
    // } else {
    // pre.right = newNode;
    // }
    // }
    // return root;
    // }

    // public TreeNode cutMaxNode(TreeNode root, TreeNode prev) {
    // if (root.right == null) {
    // deleteNode(prev, root.val);
    // return root;
    // }
    // TreeNode temp = root;

    // while (temp.right != null) {
    // prev = temp;
    // temp = temp.right;
    // }
    // deleteNode(prev, temp.val);
    // return temp;
    // }

    // public TreeNode cutMinNode(TreeNode root, TreeNode prev) {
    // if (root.left == null) {
    // deleteNode(prev, root.val);
    // return root;
    // }

    // TreeNode temp = root;
    // while (temp.left != null) {
    // prev = temp;
    // temp = temp.left;
    // }
    // deleteNode(prev, temp.val);
    // return temp;
    // }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key); // 通过此处把连接打断
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }
            TreeNode minNode = root.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            root.right = deleteNode(root.right, minNode.val); // root的右边等于删除最小值之后的根
            minNode.left = root.left;
            minNode.right = root.right;
            return minNode;
        }

        return root;
    }
}
