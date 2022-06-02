package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * 找到字符串中所有字母异位词
 * https://leetcode.cn/problems/find-all-anagrams-in-a-string/solution/
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        char[] targetArray = p.toCharArray();
        Arrays.sort(targetArray);
        String target = new String(targetArray);

        Set<Integer> result = new HashSet<>();

        int sL = s.length();
        int pL = p.length();
        for (int i = 0; i < sL - pL + 1; i++) {
            if (result.contains(i - 1) && i <= sL -1 && i + pL <= sL -1) {
                // 正确字串窗口刚移动一格，进来的刚好是出去的
                if (s.substring(i-1, i).equals(s.substring(i + pL -1 , i + pL))) {
                    result.add(i);
                } 
                continue;
            }

            String sub = s.substring(i, i+ pL);
            char[] subArray = sub.toCharArray();
            Arrays.sort(subArray);
            if (target.equals(new String(subArray))) {
                result.add(i);
            }
        }

        return new ArrayList<>(result);
    }
}
