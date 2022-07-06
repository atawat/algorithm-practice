package com.craig.learning.algorithm;

/**
 * 一和零
 * https://leetcode.cn/problems/ones-and-zeroes/
 */
public class FindMaxForm {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length+1][m+1][n+1]; //dp[i][j][k] 为选择前i个字符后，j个0，k个1的最大字串数量
        //dp[i][0][0] 无论怎么选都凑不出 0个1 0个0所以都是0


        for (int i = 1; i < strs.length+1; i++) {
            int[] zeors = getZerosAndOnes(strs[i-1]);
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    
                    if(j < zeors[0] || k < zeors[1]){
                        dp[i][j][k] = dp[i-1][j][k];
                    }else{
                        dp[i][j][k] = Math.max(dp[i-1][j][k], dp[i-1][j-zeors[0]][k-zeors[1]] + 1);
                    }
                }
            }
        }

        return dp[strs.length][m][n];
    }

    private int[] getZerosAndOnes(String s){
        int[] result = new int[2];

        for (char c : s.toCharArray()) {
            if(c == '0'){
                result[0]++;
            }else{
                result[1]++;
            }
        }

        return result;
    }
}
