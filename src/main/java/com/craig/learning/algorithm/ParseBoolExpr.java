package com.craig.learning.algorithm;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/parsing-a-boolean-expression/
 * 1106. 解析布尔表达式
 */
public class ParseBoolExpr {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> vSt = new Stack<Character>();
        Stack<Character> op = new Stack<Character>();
        char[] ch = expression.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ',') {
                continue;
            }
            if (ch[i] == '(' || ch[i] == 'f' || ch[i] == 't') {
                vSt.push(ch[i]);
            } else if (ch[i] != ')') {
                op.push(ch[i]);
            } else {
                while (vSt.peek() != '(') {
                    Character value1 = vSt.pop();
                    Character value2 = null;
                    if (op.peek() != '!' && vSt.peek() != '(') {
                        value2 = vSt.pop();
                    }
                    Character newValue = calculator(value1, value2, op.peek());
                    if (vSt.peek() != '(') {
                        vSt.push(newValue);
                    } else {
                        vSt.pop();
                        op.pop();
                        vSt.push(newValue);
                        break;
                    }
                }
            }
        }

        return vSt.peek() == 't' ? true : false;
    }

    private Character calculator(Character v1, Character v2, Character op) {
        if (op == '&') {
            return and(v1, v2);
        } else if (op == '|') {
            return or(v1, v2);
        } else {
            return negative(v1);
        }
    }

    private Character negative(Character v1) {
        return v1 == 'f' ? 't' : 'f';
    }

    private Character or(Character v1, Character v2) {
        if (v2 == null) {
            return v1;
        }
        return (v1 == 't' || v2 == 't') ? 't' : 'f';
    }

    private Character and(Character v1, Character v2) {
        if (v2 == null) {
            return v1;
        }
        return (v1 == 't' && v2 == 't') ? 't' : 'f';
    }
}
