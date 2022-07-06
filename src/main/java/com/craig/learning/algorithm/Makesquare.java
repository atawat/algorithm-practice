package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 火柴拼正方形
 * https://leetcode.cn/problems/matchsticks-to-square/
 */
public class Makesquare {
    // public boolean makesquare(int[] matchsticks) {
    // int total = 0;
    // for(int i=0;i<matchsticks.length;i++){
    // total += matchsticks[i];
    // }
    // int l = 4;
    // if(total % l != 0){
    // return false;
    // }
    // int targetLength = total / l;
    // Set<Integer> used = new HashSet<>();
    // for(int i=0;i<matchsticks.length;i++){
    // if(used.contains(i)){
    // continue;
    // }
    // int length = matchsticks[i];
    // used.add(i);
    // if(length == targetLength){
    // l--;
    // continue;
    // }
    // for(int j =i+1;j< matchsticks.length;j++){
    // int newLength = length + matchsticks[j];
    // if(newLength > targetLength){
    // continue;
    // }
    // used.add(j);
    // if (newLength == targetLength){
    // l--;
    // break;
    // }
    // length = newLength;
    // }
    // }

    // return l == 0;
    // }

    public boolean makesquare(int[] matchsticks) {
        int total = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            total += matchsticks[i];
        }
        int l = 4;
        if (total % l != 0) {
            return false;
        }
        int targetLength = total / l;
        Arrays.sort(matchsticks);
        if (matchsticks[matchsticks.length - 1] > targetLength) {
            return false;
        }

        
        boolean result = false;
        for (int i = 0; i < matchsticks.length; i++) {
        
            Set<Integer> used = new HashSet<>();
            for (int j = 0; j < l; j++) {
                if (!findCombineTarget(matchsticks.length -1, targetLength, matchsticks, used)) {
                    result = false;
                    break;
                }
                result = true;
            }
            if(result){
                break;
            }
        }
        return result;
    }
    
    public boolean findCombineTarget(int end, int sumTarget, int[] array, Set<Integer> used) {
        if (end < 0) {
            return false;
        }
        if (used.contains(end)) {
            return findCombineTarget(end - 1, sumTarget, array, used);
        }
        if (array[end] > sumTarget) {
            return findCombineTarget(end - 1, sumTarget, array, used);
        }
        if (array[end] == sumTarget) {
            used.add(end);
            return true;
        }
        int newTarget = sumTarget - array[end];
        int staticEnd = end;
        do {
            if (findCombineTarget(end - 1, newTarget, array, used)) {
                used.add(staticEnd);
                return true;
            }
        } while (--end >= 0);
        return false;
    }

        // 官方方法
    // public boolean makesquare(int[] matchsticks) {
    //     int totalLen = Arrays.stream(matchsticks).sum();
    //     if (totalLen % 4 != 0) {
    //         return false;
    //     }
    //     Arrays.sort(matchsticks);
    //     for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
    //         int temp = matchsticks[i];
    //         matchsticks[i] = matchsticks[j];
    //         matchsticks[j] = temp;
    //     }

    //     int[] edges = new int[4];
    //     return dfs(0, matchsticks, edges, totalLen / 4);
    // }

    // public boolean dfs(int index, int[] matchsticks, int[] edges, int len) {
    //     if (index == matchsticks.length) {
    //         return true;
    //     }
    //     for (int i = 0; i < edges.length; i++) {
    //         edges[i] += matchsticks[index];
    //         if (edges[i] <= len && dfs(index + 1, matchsticks, edges, len)) {
    //             return true;
    //         }
    //         edges[i] -= matchsticks[index];
    //     }
    //     return false;
    // }
}
