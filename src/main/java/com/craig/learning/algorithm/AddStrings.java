package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/add-strings/
 * 415. 字符串相加
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int add =0;
        while (i >= 0 || j >= 0) {
            int total = getCharNum(chars1, i--) + getCharNum(chars2, j--) + add;
            add = total / 10;
            int mod = total % 10;

            sb.insert(0, mod);
        }
        if (add > 0) {
            sb.insert(0, add);
        }

        return sb.toString();
    }

    private int getCharNum(char[] chars, int index) {
        if (index < 0 || index >= chars.length) {
            return 0;
        }
        return chars[index] - '0';
    }
}
