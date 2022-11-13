package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/custom-sort-string/
 * 791. 自定义字符串排序
 */
public class CustomSortString {

    public String customSortString(String order, String s) {
        Map<Character, Integer> sortMap = new HashMap<Character, Integer>();
        for (int i = 0; i < order.length(); i++) {
            sortMap.put(order.charAt(i), i);
        }
        Character[] ch = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch, (c1, c2) -> {
            return sortMap.getOrDefault(c1, -1) - sortMap.getOrDefault(c2, -1);
        });

        char[] unBox = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            unBox[i] = ch[i];
        }

        return new String(unBox);
    }
}
