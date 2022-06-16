package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 * https://leetcode.cn/problems/combinations/
 */
public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        return combine(1, n, k);
    }

    private List<List<Integer>> combine(int start, int end, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (end - start + 1 == k) {
            List<Integer> group = new ArrayList<>();
            for (int i = start; i < end + 1; i++) {
                group.add(i);
            }

            result.add(group);
            return result;
        } 
        if (start == end) {
            result.add(new ArrayList<>() {
                {
                    add(start);
                }
            });
            return result;
        }

        if (k == 1) {
            for (int i = start; i < end + 1; i++) {
                int val = i;
                result.add(new ArrayList<>() {
                    {
                        add(val);
                    }
                });
            }
            return result;
        }

        for (int i = start; i < end; i++) {
            if(end - i < k-1){
                //余下数字不够组合了
                break;
            }
            
            List<List<Integer>> lowCombine = combine(i + 1, end, k - 1);

            if (!lowCombine.isEmpty()) {
                for (List<Integer> list : lowCombine) {
                    list.add(0, i);
                }
                result.addAll(lowCombine);
            }
        }

        return result;
    }
}
