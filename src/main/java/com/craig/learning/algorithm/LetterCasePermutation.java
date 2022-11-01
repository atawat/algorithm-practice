package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/letter-case-permutation/
 * 784. 字母大小写全排列
 */
public class LetterCasePermutation {
    List<String> result = new ArrayList<String>();
    int targetLength = 0;

    public List<String> letterCasePermutation(String s) {
        if (s == null || s.length() == 0) {
            return result;
        }
        targetLength = s.length();
        char[] chars = s.toCharArray();
        backLooking(chars, 0, new StringBuilder());

        return result;
    }
    
    private void backLooking(char[] chars, int index, StringBuilder sb) {
        if (sb.length() == targetLength) {
            result.add(sb.toString());
            return;
        }
        if (isNumber(chars[index])) {
            sb.append(chars[index]);
            backLooking(chars, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        sb.append(chars[index]);
        backLooking(chars, index + 1, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(getAlpha(chars[index]));
        backLooking(chars, index + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private char getAlpha(char ch) {
        int gap = 'a' - 'A';
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - gap);
        } else {
            return (char) (ch + gap);
        }
    }
}
