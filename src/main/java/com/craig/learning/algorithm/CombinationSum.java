package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 组合总和
 * https://leetcode.cn/problems/combination-sum/
 */
public class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum(new LinkedList<>(), candidates, target, 0);
        return result;
    }

    private void combinationSum(LinkedList<Integer> path, int[] candidates, int target, int start){
        //精髓在于这个start
        if(target == 0){
            List<Integer> newComb = new ArrayList<>(path);
            result.add(newComb);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int need = target - candidates[i];
            if(need < 0){
                break;
            }
            if(need < candidates[0] && need != 0){
                continue;
            }
            if(i < candidates.length -1 && need < candidates[i] && need != 0){
                continue;
            }
            path.add(candidates[i]);
            combinationSum(path, candidates, need, i);
            path.removeLast();
        }
    }
}
