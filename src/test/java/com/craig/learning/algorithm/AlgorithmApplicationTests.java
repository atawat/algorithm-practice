package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.craig.structure.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AlgorithmApplicationTests {

    @Test
    public void maxDepthTest() {
        TreeNode root = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);

        root.left = n9;
        root.right = n20;

        n20.left = n15;
        n20.right = n7;

        int depth = maxDepth(root);
        Assertions.assertEquals(3,depth);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Stack<TreeNode>> stacks = new ArrayList<>();
        stacks.add(s1);
        stacks.add(s2);
        int pivot = 0;
        s1.push(root);
        int level = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            Stack<TreeNode> usedStack = stacks.get(pivot);
            Stack<TreeNode> anotherStack = stacks.get(pivot^1);
            TreeNode node = usedStack.pop();
            if (usedStack.isEmpty()) {
                level++;
                pivot = pivot^1;
            }
            if (node.left != null) {
                anotherStack.push(node.left);
            }
            if (node.right != null) {
                anotherStack.push(node.right);
            }
        }
        return level;
    }

}
