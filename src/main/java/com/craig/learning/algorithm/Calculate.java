package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 计算器
 * https://leetcode.cn/problems/basic-calculator/
 */
public class Calculate {
    private Map<Character, Integer> priority = new HashMap<>();

    private EvalRPN eval = new EvalRPN();

    public Calculate() {
        priority.put(')', 0);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('(', 0);
    }

    public int calculate(String s) {
    
        Stack<Character> opStack = new Stack<>();
        char[] c = s.toCharArray();
        StringBuilder rpn = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                rpn.append(c[i]);
                continue;
            }  
            if (c[i] == '(') {
                opStack.push(c[i]);
                continue;
            } 
            if (c[i] == ' ') {
                continue;
            }
            if(c[i] == '-'){
                if(i == 0 || (c[i-1] ==' ' && c[i-2] < '0') || (c[i-1] <'0' && c[i-1] !=')' && c[i-1] !=' ' ) ){
                    rpn.append("0");
                }
            }
            if (c[i] != ')'){
                rpn.append(' ');
            }

            while (!opStack.empty() && (c[i] == ')' || priority.get(opStack.peek()) >= priority.get(c[i]))) {
                char op = opStack.pop();
                if (op == '(') {
                    break;
                }
                rpn.append(" ");
                rpn.append(op);
            }
            if (c[i] != ')') {
                opStack.push(c[i]);
                rpn.append(" ");
            }
        }
        
        while (!opStack.empty()) {
            rpn.append(" ");
            rpn.append(opStack.pop());
        }
        return eval.evalRPN(rpn.toString().split(" "));
    }
}
