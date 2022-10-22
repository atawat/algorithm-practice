package com.craig.learning.algorithm;

/**
 * 解码方法
 * https://leetcode.cn/problems/decode-ways/
 */
public class NumDecodings {
    // public int numDecodings(String s) {
    //     int[] dp = new int[s.length() +1]; //以1开始的下标，dp[i]为i处最大的字符串
    //     dp[0] = 1;
    //     for (int i = 1; i < s.length() +1; i++) {
    //         if(s.charAt(i-1) != '0'){
    //             dp[i] += dp[i-1];   //单独作为一个编码，则结果为上一个的数量
    //         }
    //         if( i > 1 && s.charAt(i-2) != '0' &&(s.charAt(i-2) - '0') *10 + (s.charAt(i-1) - '0') <= 26){
    //             dp[i] += dp[i-2];   //检查能否与前一个构成编码，则结果为上2个的数量
    //         }
    //     }

    //     return dp[s.length()];
    // }    
    
    public int numDecodings(String s) {
        if(s.startsWith("0")){
            return 0;
        }
        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        
        for(int i = 1; i <= s.length(); i++){
            
            if(s.charAt(i-1) != '0'){
                dp[i] += dp[i-1];
            }
            if(i > 1 && s.charAt(i-2) != '0' &&(s.charAt(i-2) - '0') *10 + (s.charAt(i-1) - '0') <= 26){
                dp[i] += dp[i-2];
            }
        }
        
        return dp[s.length()];
    }
}
