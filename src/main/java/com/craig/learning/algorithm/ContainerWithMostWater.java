package com.craig.learning.algorithm;

/**
 * 11.Container With Most Water
 */
public class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = height.length - 1; i > 0; i--) {
            int left = 0;
            int right = left + i;

            while (right <= height.length - 1) {
                int tempHeight;
                if (height[left] > height[right]) {
                    tempHeight = height[right];
                } else {
                    tempHeight = height[left];
                }
                int area = tempHeight * i;
                if (area > maxArea) {
                    maxArea = area;
                }
                left++;
                right++;
            }
        }
        return maxArea;
    }

}