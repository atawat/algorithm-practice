package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 分割回文串
 * https://leetcode.cn/problems/palindrome-partitioning/
 */
public class Partition {
    List<List<String>> result = new ArrayList<>();
    int[][] matrix ;

    public List<List<String>> partition(String s) {
        matrix = new int[s.length()][s.length()];
        backTracing(s,0, new LinkedList<>());

        return result;
    }

    private void backTracing(String s, int start, LinkedList<String> group){
        if(start == s.length()){
            result.add(new ArrayList<>(group));
        }

        for (int i = start; i < s.length(); i++) {
            if(isPalindromeWithMemory(s, start,i)){
                group.add(s.substring(start, i+1));
            }else{
                continue;
            }
            backTracing(s, i + 1, group);
            group.removeLast();
        }
    }

    private boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    /**
     * 判断回文串(使用记忆矩阵优化，matrix[start][end] = 0 未判断，1 是回文串， 2 不是回文串)
     * @param s
     * @param start
     * @param end
     * @return
     */
    private boolean isPalindromeWithMemory(String s, int start, int end){
        if(matrix[start][end] != 0){
            return matrix[start][end] == 1;
        }
        if(start >= end){
            matrix[start][end] = 1;
        }else if (s.charAt(start) == s.charAt(end)){
             if(isPalindromeWithMemory(s, start +1, end -1)){
                matrix[start][end] = 1;
             }else{
                matrix[start][end] = -1;
             }
        } else {
            matrix[start][end] = -1;
        }

        return matrix[start][end] == 1;
    }
}
