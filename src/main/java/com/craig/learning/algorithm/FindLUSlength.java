package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.objenesis.strategy.SingleInstantiatorStrategy;

/**
 * 最长特殊序列 II
 * https://leetcode.cn/problems/longest-uncommon-subsequence-ii/
 */
public class FindLUSlength {
    public int findLUSlength(String[] strs) {
        // 没有考虑字符相同，但是顺序不一致的情况
        // Map<Character,HashSet<Integer>> map = new HashMap<>();

        // for (int i = 0; i < strs.length; i++) {
        //     for (int j = 0; j < strs[i].length(); j++) {
        //         HashSet<Integer> indexSet = map.get(strs[i].charAt(j));
        //         if(indexSet == null){
        //             indexSet = new HashSet<>();
        //             map.put(strs[i].charAt(j), indexSet);
        //         }

        //         indexSet.add(i);
        //     }
        // }

        // int maxLength = -1;
        // for (Map.Entry<Character,HashSet<Integer>> entry : map.entrySet()) {
        //     if(entry.getValue().size() > 1){
        //         continue;
        //     }
        //     Integer index = entry.getValue().iterator().next();
        //     maxLength = Math.max(strs[index].length(), maxLength); 
        // }

        // return maxLength;

        int maxLength = -1;
        for (int i = 0; i < strs.length; i++) {
            boolean hasSub = false;
            for (int j = 0; j < strs.length; j++) {
                if (i != j && isSubseq(strs[i], strs[j])) {
                    hasSub = true;
                    break;
                }
            }

            if (!hasSub) {
                maxLength = Math.max(strs[i].length(), maxLength) ;
            }
        }

        return maxLength;
    }

    public boolean isSubseq(String s, String t) {
        int sIndex =0;
        int tIndex = 0;

        while(sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }
}
