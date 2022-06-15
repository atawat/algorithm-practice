package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.craig.structure.TreeNode;

/**
 * 二叉搜索树中的众数
 * https://leetcode.cn/problems/find-mode-in-binary-search-tree/
 */
public class FindMode {
    int pre = Integer.MIN_VALUE;
    int count = 0;
    int maxCount = 0;
    List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        retriveTree(root);
        if (count >= maxCount) {
            if (count > maxCount) {
                result.clear();
            }
            maxCount = count;
            result.add(pre);
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    private void retriveTree(TreeNode root) {
        if (root.left != null) {
            retriveTree(root.left);
        }
        
        if (root.val != pre) {
            if (count >= maxCount) {
                if (count > maxCount) {
                    result.clear();
                }
                maxCount = count;
                result.add(pre);
            }
            pre = root.val;
            count = 0;
        }
        count++;
        if (root.right != null) {
            retriveTree(root.right);
        }
    }
}
