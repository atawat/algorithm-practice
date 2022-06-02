package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *  查找共用字符
 * https://leetcode.cn/problems/find-common-characters/
 */
public class CommonChars {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] sumMap = buildMap(words[0]);

        for (int i = 1; i < words.length; i++) {
            int[] map = buildMap(words[i]);
            for (int j = 0; j < sumMap.length; j++) {
                sumMap[j] = Math.min(sumMap[j], map[j]);
            }
        }

        for(int i= 0;i< sumMap.length;i++){
            if(sumMap[i] > 0){
                for(int j =0;j< sumMap[i];j++){
                    result.add(Character.valueOf((char)(i + 'a')).toString());
                }
            }
        }

        return result;
    }

    private int[] buildMap(String word) {
        int[] map = new int[26];
        for (char c : word.toCharArray()) {
            map[c - 'a']++;
        }

        return map;
    }
}
