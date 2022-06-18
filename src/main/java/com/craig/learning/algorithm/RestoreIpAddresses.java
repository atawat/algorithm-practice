package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 复原 IP 地址
 * https://leetcode.cn/problems/restore-ip-addresses/
 */
public class RestoreIpAddresses {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        try {
            backTracing(s, 0, new StringBuilder(), 1);
        } catch (Exception e) {
            return Collections.emptyList();
        }
        return result;
    }

    private void backTracing(String s, int start, StringBuilder sb, int seed) {
        if (seed == 5) {
            if (start == s.length()) {
                result.add(sb.toString()); // 正确ip入队列
            }
            // 数字不够
            return;
        }
        if (seed > 5) {
            return;
        }

        if(seed >1 && s.length() - sb.length() + (seed - 2) > (5 - seed) * 3 ){
            return;
        }

        for (int i = 0; i < 3 && start + 1 + i <= s.length(); i++) {
            String seg = s.substring(start, start + 1 + i);
            if (isIpSeg(seg)) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(seg);
            } else {
                continue;
            }

            backTracing(s, start + i + 1, sb, seed + 1);

            sb.delete(sb.length() - 1 * (seed == 1?0:1) - seg.length(), sb.length());
        }
    }

    private boolean isIpSeg(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            // 以0开头的
            return false;
        }
        if (s.length() == 3 && s.charAt(0) > '2') {
            // 超过255
            return false;
        }
        int seed = 0;
        int num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int bit = s.charAt(i) - '0';
            num += bit * Math.pow(10, seed);
            seed++;
        }

        return num <= 255;
    }
}
