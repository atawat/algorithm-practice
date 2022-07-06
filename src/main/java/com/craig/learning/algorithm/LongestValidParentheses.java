package com.craig.learning.algorithm;

import java.util.Stack;

/**
 * 最长有效括号
 * https://leetcode.cn/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] == '(')
                stack.push(i);
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);  //为了计算长度，需要把没用的）入栈
                }else{
                    max = Math.max(i - stack.peek(), max);
                }
                
            }
        } 

        return max;
    }
}
