package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * https://leetcode.cn/problems/generate-parentheses/
 */
public class GenerateParenthesis {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backTrack(n,0,0,new StringBuilder());
        return result;
    }

    private void backTrack(int n, int leftBraceCount,int rightBraceCount, StringBuilder sb){
        if(sb.length() == n*2){
            result.add(sb.toString());
            return;
        }

        if(leftBraceCount < n){
            sb.append('(');
            backTrack(n, leftBraceCount + 1, rightBraceCount, sb);
            sb.delete(sb.length()-1, sb.length());
        }

        if(rightBraceCount < leftBraceCount){
            sb.append(')');
            backTrack(n, leftBraceCount, rightBraceCount+1, sb);
            sb.delete(sb.length()-1, sb.length());
        }

    }
}
