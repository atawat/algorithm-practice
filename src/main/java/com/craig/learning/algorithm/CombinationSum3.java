package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 组合总和 III
 * https://leetcode.cn/problems/combination-sum-iii/
 */
public class CombinationSum3 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        combineSum(k, n, 1, 9);
        return result;
    }

    private void combineSum(int k, int target, int start, int end) {
        if (k == 1) {
            if (target >= start && target <= end) {
                temp.add(target);
                result.add(temp.stream().collect(Collectors.toList()));
                temp.removeLast();
            }
            return;
        }
        if (target == 0) {
            return;
        }
        for (int i = start; i <= end - 1; i++) {
            int need = target - i;
            if (need > target - start || need <= i || need > (i+ 1 + end) * (end -i) / 2) { //1到9 9位全加上最多45
                //需要的和 大于剩余数字的合，
                //剪枝
                break;
            }
            temp.add(i);
            int tempSize = temp.size();
            combineSum(k - 1, need, i + 1, end);
            if (temp.size() != 0 && temp.size() == tempSize) {
                // 该组合没有找到
                temp.removeLast();
            }
        }
    }
}
