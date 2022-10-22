package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class IsValidString {

    public static String isValid(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        //统计众数
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < map.length; i++) {
            if(map[i] == 0){
                continue;
            }
            countMap.put(map[i], countMap.getOrDefault(map[i], 0) + 1);
        }

        int modeCount = -1;
        int modeNum = -1;

        for (Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() > modeCount){
                modeCount = entry.getValue();
                modeNum = entry.getKey();
            }
        }

        int gap = 0;
        for (int i = map.length - 1; i >= 0; i--) {
            if(map[i] == 0){
                continue;
            }

            if(map[i] != modeNum){
                gap += Math.min(Math.abs(map[i] - modeNum), map[i]);  //删除自己，或添加
            }
        }

        return (gap <= 1) ? "YES" : "NO";
    }
}
