package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/ambiguous-coordinates/
 * 816. 模糊坐标
 */
public class AmbiguousCoordinates {
    private List<String> coordinates = new ArrayList<String>();

    public List<String> ambiguousCoordinates(String s) {
        char[] c = s.replace("(", "").replace(")", "").toCharArray();

        for (int i = 0; i < c.length - 1; i++) {
            numBackLooking(c, 0, i, new ArrayList<String>(), 0);
        }

        return coordinates;
    }

    private void numBackLooking(char[] c, int lStart, int lEnd, List<String> nums, int numsIndex) {
        if (nums.size() == 2) {
            String result = "(" + String.join(",", nums) + ")";
            coordinates.add(result);
            return;
        }
        for (int i = lStart; i <= lEnd; i++) {
            boolean isDecimal = isValid(c, lStart, i, true);
            if (i != lEnd) {
                isDecimal &= isValid(c, i + 1, lEnd, false);
            }

            if (isDecimal) {
                nums.add(getDecimal(c, i, lStart, lEnd));

                int rStart = lEnd + 1;
                int rEnd = c.length - 1;
                numBackLooking(c, rStart, rEnd, nums, numsIndex + 1);
                nums.remove(numsIndex);
            }
        }
    }

    private String getDecimal(char[] c, int pointIndex, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(c[i]);
            if (i == pointIndex && i != end) {
                sb.append(".");
            }
        }

        return sb.toString();
    }

    private boolean isValid(char[] c, int start, int end, boolean isLeft) {
        if (isLeft) {
            if (start == end) {
                return true;
            }
            return c[start] > '0';
        }
        return c[end] > '0';
    }
}
