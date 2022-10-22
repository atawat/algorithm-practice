package com.craig.learning.algorithm;

/**
 * 验证IP地址
 * https://leetcode.cn/problems/validate-ip-address/
 */
public class ValidIPAddress {
    public String validIPAddress(String queryIP) {
        if (isIPV4(queryIP)) {
            return "IPv4";
        }

        if (isIPV6(queryIP)) {
            return "IPv6";
        }

        return "Neither";
    }

    private boolean isIPV4(String queryIP) {
        if (queryIP.endsWith(".") || queryIP.startsWith(".")) {
            return false;
        }
        String[] seg = queryIP.split("\\.");
        if (seg.length != 4) {
            return false;
        }

        for (int i = 0; i < seg.length; i++) {
            char[] segChars = seg[i].toCharArray();
            if (segChars.length <= 0 || segChars.length > 3) {
                return false;
            }
            if (segChars[0] == '0' && segChars.length > 1) {
                return false;
            }
            int seed = 0;
            for (char c : segChars) {
                if (c < '0' || c > '9') {
                    return false;
                }
                seed = (c - '0') + seed * 10;
            }
            if (seed > 255 || seed < 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isIPV6(String queryIP) {
        if (queryIP.endsWith(":") || queryIP.startsWith(":")) {
            return false;
        }
        String[] seg = queryIP.split(":");
        if (seg.length != 8) {
            return false;
        }

        for (int i = 0; i < seg.length; i++) {
            char[] segChars = seg[i].toCharArray();
            if (segChars.length <= 0 || segChars.length > 4) {
                return false;
            }

            for (int j = 0; j < segChars.length; j++) {
                if ((segChars[j] >= '0' && segChars[j] <= '9') || (segChars[j] >= 'a' && segChars[j] <= 'f')
                        || (segChars[j] >= 'A' && segChars[j] <= 'F')) {
                    continue;
                }

                return false;
            }
        }

        return true;
    }
}
