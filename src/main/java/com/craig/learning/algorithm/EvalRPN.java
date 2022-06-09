package com.craig.learning.algorithm;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 计算逆波兰表达式
 */
public class EvalRPN {
    Pattern numberP = Pattern.compile("-?\\d+");

    public int evalRPN(String[] tokens) {
        Stack<Integer> op = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (isNumber(tokens[i])) {
                op.push(Integer.valueOf(tokens[i]));
                continue;
            }
            Integer number1 = op.pop();
            Integer number2 = op.pop();
            int result;
            if(tokens[i].equals("+")){
                 result = number1 + number2;
            }else if (tokens[i].equals("-")){
                result = number2 - number1;
            }else if (tokens[i].equals("*")){
                result = number1 * number2;
            }else if (tokens[i].equals("/")){
                result = number2 / number1;
            }else{
                continue;
            }

            op.push(result);
        }

        return op.pop();
    }

    private boolean isNumber(String string) {
        Pattern.matches("-?\\d+", string);
        Matcher m = numberP.matcher(string);
        return m.matches();
    }
}
