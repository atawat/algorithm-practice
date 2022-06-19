package com.craig.learning.algorithm;

/**
 * 解数独
 * https://leetcode.cn/problems/sudoku-solver/
 */
public class SolveSudoku {
    public void solveSudoku(char[][] board) {
        lookingBack(board);
    }

    private boolean lookingBack(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    continue;
                }

                for (int k = 0; k < 9; k++) {
                    if (!isValid(board, i, j, '1' + k)) {
                        continue;
                    }
                    board[i][j] = (char) ('1' + k);
                    if (!lookingBack(board)) {
                        board[i][j] = '.';
                        continue;
                    }

                    return true;
                }
                return false;
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) val) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) val) {
                return false;
            }
        }

        int subMatrixRow = 3 * (row / 3);
        int subMatrixCol = 3 * (col / 3);

        for (int i = subMatrixRow; i < subMatrixRow + 3; i++) {
            for (int j = subMatrixCol; j < subMatrixCol + 3; j++) {
                if (board[i][j] == (char) val) {
                    return false;
                }
            }
        }

        return true;
    }
}
