package com.craig.learning.algorithm;

import java.util.Stack;

/**
 * 删除字符串中的所有相邻重复项
 * https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveAllAdjacentDuplicatesString {
    Stack<Character> stack = new Stack<>();
    
    public String removeDuplicates(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(stack.empty() || stack.peek() != c[i]){
                stack.push(c[i]);
                continue;
            }
            stack.pop();
        }
        char[] newChar = new char[stack.size()];

        for (int i = newChar.length - 1; i >= 0; i--) {
            newChar[i] = stack.pop();
        }

        return new String(newChar);
    }
}