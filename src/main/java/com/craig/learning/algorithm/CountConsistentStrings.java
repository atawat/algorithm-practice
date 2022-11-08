package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/count-the-number-of-consistent-strings/
 * 1684. 统计一致字符串的数目
 */
public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] map = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            int mapIndex = allowed.charAt(i) - 'a';
            map[mapIndex]++;
        }

        int count =0;
        for (String word : words) {
            int existSize = 0;
            for (int j = 0; j < word.length(); j++) {
                if (map[word.charAt(j) - 'a'] > 0) {
                    existSize++;
                }
            }
            if(existSize == word.length()){
                count++;
            }
        }
        return count;
    }
}
