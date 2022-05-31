package com.craig.learning.algorithm;

public class GenerateMatrix {

    private int[][] direction = new int[][] {
        { 0, 1 },
        { 1, 0 },
        { 0, -1 },
        { -1, 0 }
    };

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int roud = (int)Math.ceil(n /2.0) ;
        int length = n -1;
        int num = 0;
        for (int i = 0; i < roud; i++) {
            int j =i;
            int k =i;
            result[j][k] = ++num;

            for(int b = 0; b < 4;b++){
                int v =0;
                while (v < length){
                    if(b == 3 && v == length -1){
                        break;
                    }
                    j += direction[b][0];
                    k += direction[b][1];
                    result[j][k] = ++num;
                    v++;
                }
            }

            length -= 2;
        }

        return result;
    }
}