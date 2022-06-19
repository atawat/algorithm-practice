package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * 分发饼干
 * https://leetcode.cn/problems/assign-cookies/
 */
public class FindContentChildren {
    
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int j =s.length -1;
        for (int i = g.length -1; i >= 0; i--) {
            if(j>=0 && g[i] <= s[j]){
                res++;
                j--;
            }
        }

        return res;
    }
}
