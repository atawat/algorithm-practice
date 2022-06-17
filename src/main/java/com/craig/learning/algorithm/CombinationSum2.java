package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 组合总和 II
 * https://leetcode.cn/problems/combination-sum-ii/
 */
public class CombinationSum2 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        combinationSum(candidates, 0, target, new LinkedList<>());

        return result;
    }

    private void combinationSum(int[] candidates, int start, int target, LinkedList<Integer> path) {
        if (target == 0) {
            List<Integer> newComb = new ArrayList<>(path);
            result.add(newComb);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                //同层次遍历下，去除重复元素
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            int need = target - candidates[i];
            if (need < candidates[start] && need != 0) {
                continue;
            }

            path.add(candidates[i]);
            combinationSum(candidates, i + 1, need, path);
            path.removeLast();
        }
    }
}
