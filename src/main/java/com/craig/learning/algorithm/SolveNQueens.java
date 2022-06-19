package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * N 皇后
 * https://leetcode.cn/problems/n-queens/
 */
public class SolveNQueens {
    char[][] usedMap;
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        usedMap = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                usedMap[i][j] ='.';
            }
        }

        lookingBack(0, n);
        return result;
    }

    private void lookingBack(int row, int n) {
        if (row == n) {
            result.add(convert2List());
            return;
        }
        // 寻找列位置
        for (int i = 0; i < n; i++) {
            if (!isValid(row, i)) {
                continue;
            }

            usedMap[row][i] = 'Q';
            lookingBack(row + 1, n);
            usedMap[row][i] = '.';
        }
    }

    private List<String> convert2List() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < usedMap.length; i++) {
            stringList.add(new String(usedMap[i]));
        }

        return stringList;
    }

    private boolean isValid(int row, int col) {
        
        //行不用检测，每次都是新行
        for (int i = 0; i < usedMap.length; i++) {
            if(usedMap[i][col] == 'Q'){
                return false;
            }
        }

        //只用比上方的对角线，下面的还没开始呢
        int tempRow = row;
        int tempCol = col;
        while (tempRow > 0 && tempCol > 0) {
            if(usedMap[--tempRow][--tempCol] == 'Q'){
                return false;
            }
        }

        tempRow = row;
        tempCol = col;
        while (tempRow > 0 && tempCol < usedMap.length -1) {
            if(usedMap[--tempRow][++tempCol] == 'Q'){
                return false;
            }
        }

        return true;
    }
}
