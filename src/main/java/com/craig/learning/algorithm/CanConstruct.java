package com.craig.learning.algorithm;

/**
 * 赎金信
 * https://leetcode.cn/problems/ransom-note/
 */
public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (char c : ransomNote.toCharArray()) {
            map[c - 'a']++;
        }

        for (char c : magazine.toCharArray()) {
            if (map[c - 'a'] > 0)
                map[c - 'a']--;
        }

        for (int i : map) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
