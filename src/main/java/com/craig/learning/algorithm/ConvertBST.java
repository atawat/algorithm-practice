package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

public class ConvertBST {
    public TreeNode convertBST(TreeNode root) {
        retriveTree(root, 0);
        return root;
    }

    private int retriveTree(TreeNode root,int seed){
        if(root ==null){
            return seed;
        }
        int rightSum =  retriveTree(root.right, seed);
        root.val += rightSum;
        return retriveTree(root.left, root.val);
    }
}
