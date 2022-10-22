package com.craig.learning.algorithm;

/**
 * https://www.hackerrank.com/challenges/special-palindrome-again/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class SpecialPalindromeAgain {

    // 动规无法通过hackerrank测试
    // public long substrCount(int n, String s) {
    // char[] charArray = s.toCharArray();

    // boolean[][] dp = new boolean[n][n];

    // int palindromeCount = 0;
    // for (int i = 0; i < charArray.length; i++) {
    // palindromeCount++;
    // dp[i][i] = true;
    // }

    // for (int length = 2; length <= charArray.length; length++) {
    // for (int i = 0; i < charArray.length && i + length - 1 < charArray.length;
    // i++) {
    // int j = i + length - 1;
    // if (charArray[i] == charArray[j]) {
    // if (length == 2 || i + 1 == j - 1) {
    // dp[i][j] = true;
    // } else {
    // dp[i][j] = dp[i + 1][j - 1] && charArray[i] == charArray[i + 1]
    // && charArray[j] == charArray[j - 1];
    // }
    // if (dp[i][j])
    // palindromeCount++;
    // }
    // }
    // }

    // debug(dp, s);
    // return palindromeCount;
    // }

    //中心扩展法可以通过测试
    public long substrCount(int n, String s) {
        int palindromeCountCount = 0;

        for (int i = 0; i < s.length(); i++) {
            int right = i + 1;
            int left = i - 1;

            palindromeCountCount += getCount(left, right, s);
            if (i + 1 >= s.length() || s.charAt(i + 1) != s.charAt(i)) {
                continue;
            }

            right = i + 1;
            left = i;

            palindromeCountCount += getCount(left, right, s);
        }

        return palindromeCountCount + n;
    }

    private int getCount(int left, int right, String s) {
        if (left < 0 || right >= s.length()) {
            return 0;
        }
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
            if (count > 0 && s.charAt(left) != s.charAt(left + 1)) {
                break;
            }
            count++;
            left -= 1;
            right += 1;
        }

        return count;
    }

    private void debug(boolean[][] dp, String s) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (dp[i][j]) {
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
    }
}
