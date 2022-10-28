package com.craig.learning.algorithm;

import java.util.HashSet;

/**
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right =0;
        int maxLength = 1; //默认第一个字符
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add(chars[0]);
        while (left < chars.length && right < chars.length) {
            while (right + 1 < chars.length && !set.contains(chars[right + 1])) {
                set.add(chars[++right]);
            }
            maxLength = Math.max(maxLength, right - left + 1);

            set.remove(chars[left++]);
        }
        
        return maxLength;
    }
}
