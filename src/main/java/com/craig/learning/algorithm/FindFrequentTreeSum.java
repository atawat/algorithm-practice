package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.craig.structure.TreeNode;

public class FindFrequentTreeSum {
    Map<Integer, Integer> sizeMap = new HashMap<>();
    int maxCount = 0;
    
    public int[] findFrequentTreeSum(TreeNode root) {

        retriveTree(root);

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sizeMap.entrySet()) {
            if(entry.getValue() != maxCount){
                continue;
            }
            resultList.add(entry.getKey());
        }

        int[] result =new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    private int retriveTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = retriveTree(root.left);
        int rightSum = retriveTree(root.right);

        int treeSum = root.val + leftSum + rightSum;

        Integer count = sizeMap.get(treeSum);
        if(count == null){
            count = 0;
        }
        
        sizeMap.put(treeSum, ++count);

        maxCount = Math.max(maxCount, count);

        return treeSum;
    }
}
