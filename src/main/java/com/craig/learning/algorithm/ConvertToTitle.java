package com.craig.learning.algorithm;

/**
 * Excel表列名称
 * https://leetcode.cn/problems/excel-sheet-column-title/
 */
public class ConvertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            columnNumber--;  //精妙之处
            int index = columnNumber % 26;
            char a = (char)(index + 'A');
            sb.append(a);

            columnNumber = columnNumber / 26;
        }

        return sb.reverse().toString();
    }
}
