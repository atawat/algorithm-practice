package com.craig.learning.algorithm;

import java.util.Stack;

/**
 * 有效的括号
 * https://leetcode.cn/problems/valid-parentheses/
 */
public class IsValid {
    Stack<Character> stack = new Stack<>();

    // public boolean isValid(String s) {
    // char[] c = s.toCharArray();
    // if(c.length % 2 == 1){
    // return false;
    // }
    // for (int i = 0; i < c.length; i++) {
    // if(c[i] == '{' || c[i] == '[' || c[i] == '('){
    // stack.push(c[i]);
    // continue;
    // }
    // if(stack.empty()){
    // return false;
    // }
    // Character left = stack.pop();
    // if(left == null){
    // return false;
    // }
    // if(c[i] == '}' && left != '{'){
    // return false;
    // }else if (c[i] == ']' && left != '['){
    // return false;
    // } else if (c[i] == ')' && left != '('){
    // return false;
    // }
    // }

    // return stack.isEmpty();
    // }
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (stack.isEmpty() || isLeft(c[i])) {
                stack.push(c[i]);
                continue;
            }
            if (isPair(stack.peek(), c[i])) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isPair(Character peek, char c) {
        if ((peek == '(' && c == ')') || (peek == '{' && c == '}') || (peek == '[' && c == ']')) {
            return true;
        }
        return false;
    }

    private boolean isLeft(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
