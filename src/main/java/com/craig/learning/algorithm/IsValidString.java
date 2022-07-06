package com.craig.learning.algorithm;

import java.util.Arrays;

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
        Arrays.sort(map);
        int top = map[map.length - 1];
        int gap = 0;
        for (int i = map.length - 1; i >= 0; i--) {
            if (map[i] == 0) {
                break;
            }
            if (i < map.length - 1 && map[i] < map[i + 1]) {
                top = map[i + 1];
            }
            if (i > 0 && map[i] < top) {
                int aGap = top - map[i];
                if (aGap > 1) {
                    return "NO";
                }
                gap += aGap;
            }
        }

        return (gap <= 1) ? "YES" : "NO";
    }
}
