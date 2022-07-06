package com.craig.learning.algorithm;

/**
 * 
 * https://leetcode.cn/problems/number-of-islands/
 */
public class NumIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int starti,int startj){
        grid[starti][startj] = '0';

        if(starti > 0 && grid[starti-1][startj] == '1'){
            dfs(grid, starti-1, startj);
        }
        if(startj > 0 && grid[starti][startj-1] == '1'){
            dfs(grid, starti, startj-1);
        }
        if(starti <grid.length-1 && grid[starti+1][startj] == '1'){
            dfs(grid, starti+1, startj);
        }
        if(startj < grid[0].length-1 &&grid[starti][startj+1] == '1'){
            dfs(grid, starti, startj+1);
        }
    }
}
