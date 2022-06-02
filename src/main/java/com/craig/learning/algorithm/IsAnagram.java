package com.craig.learning.algorithm;
/**
 * 有效的字母异位词
 * https://leetcode.cn/problems/valid-anagram/
 */
public class IsAnagram{
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for(char c : s.toCharArray()){
            int i = Integer.valueOf(c) - Integer.valueOf('a');
            map[i]++;
        }
        for(char c : t.toCharArray()){
            int i = Integer.valueOf(c) - Integer.valueOf('a');
            map[i]--;
        }
        boolean result =true;
        for(int i : map){
            if(i != 0){
                result = false;
                break;
            }
        }

        return result;
    }
}