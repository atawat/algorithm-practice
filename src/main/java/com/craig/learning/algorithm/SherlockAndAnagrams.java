package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;
/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */
public class SherlockAndAnagrams {

    // public static int sherlockAndAnagrams(String s) {
    //     // Write your code here
    //     Map<String, Integer> sizeMap = new HashMap<>();
    //     for (int i = 1; i <= s.length() - 1; i++) {
    //         for (int j = 0; j < s.length() - i + 1; j++) {
    //             String key = calKey(s, j, j + i);
    //             Integer count = sizeMap.get(key);
    //             if(count == null){
    //                 count = 0;
    //             }
    //             sizeMap.put(key, ++count);
    //         }
    //     }
    //     int result = 0;
    //     for (Map.Entry<String, Integer> entry : sizeMap.entrySet()) {
    //         if(entry.getValue() < 2){
    //             continue;
    //         }
    //         int count = entry.getValue();
    //         if (count == 2) {
    //             result += 1;
    //         } else {
    //             //求组合, 会溢出
    //             result += factorial(count)  / ((factorial(2) * factorial(count-2)));
    //         }
    //     }

    //     return result;
    // }

    // public static long factorial(int n) {
    //     long fact = 1;
    //     int i = 1;
    //     while(i <= n) {
    //        fact *= i;
    //        i++;
    //     }
    //     return fact;
    // }

    private static int count =0; 

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        for (int i = 1; i <= s.length() - 1; i++) {
            lookingBack(1, i, s, calKey(s, 0, i));
        }

        return count;
    }

    public static void lookingBack(int start, int length, String s, String targetKey){
        if(start>= s.length()){
            return;
        }
        for (int i = start; i < s.length() - length +1; i++) {
             String key = calKey(s, i, i+length);
             if(targetKey.equals(key)){
                count++;
                continue;
             }
        }

        if(start + length >= s.length()){
            return;
        }
        String newTargetKey = calKey(s, start, start + length);
        lookingBack(start+1, length, s, newTargetKey);
    }

    public static String calKey(String s, int start, int end) {
        int[] map = new int[26];
        for (int i = start; i < end; i++) {
            map[s.charAt(i) - 'a']++;
        }

        String key = "";
        for (int i = 0; i < map.length; i++) {
            if (map[i] > 0) {
                key += (char) ('a' + i) + Integer.toString(map[i]);
            }
        }

        return key;
    }
}
