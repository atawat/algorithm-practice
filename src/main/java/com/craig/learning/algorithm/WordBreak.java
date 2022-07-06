package com.craig.learning.algorithm;

import java.util.List;

/**
 * 单词拆分
 * https://leetcode.cn/problems/word-break/
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < wordDict.size(); i++) {
            int l = wordDict.get(i).length();
            if( l < minLength){
                minLength = l;
            }
        }
        boolean[] dp = new boolean[s.length() +1]; //dp[i] 为从1开始的下标，1-i的字符串能否拼接
        dp[0] = true;
        for (int i = minLength; i <= s.length(); i++) {
            for (int j = 0; j <i; j++) {
                String target = s.substring(j, i);
                if(wordDict.contains(target) && dp[j]){ //条件要写上面，写下面会给已经复制true的改为false
                    dp[i] = true;
                }
            }
        }

        return dp[s.length()];
    }
}
