package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        return root;
    }
}
