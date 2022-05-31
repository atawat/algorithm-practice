package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import com.craig.structure.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AlgorithmApplicationTests {

    @Test
    void contextLoads() {
        HashMap<String, String> test = new HashMap<>();
        test.put("test", "test");
        test.put("1", "1");
        test.put("2", "2");
    }
    
    @Test
    void twoSum() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 99};
        int target = 112;

        int[] result = twoSum(a, target);

    }

    private int[] twoSum(int[] a, int target) {

        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            int first = a[i];
            int need = target - first;
            if (need > a[a.length - 1]) {
                continue;
            }
            int needIndex = findNeed(a, need, i + 1);
            if (needIndex == -1) {
                continue;
            }
            result[0] = i;
            result[1] = needIndex;
            break;
        }

        return result;
    }

    private int findNeed(int[] a, int need, int i) {
        int left = i;
        int right = a.length - 1;
        int mid = (left + right) / 2;
        while (a[mid] != need && left <= right) {
            if (need > a[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        if (a[mid] == need) {
            return mid;
        }
        return -1;
    }

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
