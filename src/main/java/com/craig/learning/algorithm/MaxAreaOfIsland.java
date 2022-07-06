package com.craig.learning.algorithm;

/**
 * 岛屿的最大面积
 * https://leetcode.cn/problems/max-area-of-island/
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int starti, int startj) {
        grid[starti][startj] = 0;

        int area = 0;
        if (starti > 0 && grid[starti - 1][startj] == 1) {
            area += dfs(grid, starti - 1, startj);
        }
        if (startj > 0 && grid[starti][startj - 1] == 1) {
            area += dfs(grid, starti, startj - 1);
        }
        if (starti < grid.length - 1 && grid[starti + 1][startj] == 1) {
            area += dfs(grid, starti + 1, startj);
        }
        if (startj < grid[0].length - 1 && grid[starti][startj + 1] == 1) {
            area += dfs(grid, starti, startj + 1);
        }

        return area + 1;
    }
}
