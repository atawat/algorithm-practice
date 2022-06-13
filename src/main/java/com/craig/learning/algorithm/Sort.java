package com.craig.learning.algorithm;

public class Sort {
    /**
     * 选择排序
     * @param s
     * @return
     */
    public int[] selectSort(int[] s){
        int moveCount =0;
        for (int i = 1; i < s.length; i++) {
            int j = i;
            int key = s[i];
            while(j>0 && key< s[j -1]){
                s[j] = s[j-1]; 
                j--;               
            }
            if(j != i){
                s[j] = key;
                moveCount++;
            }
        }

        System.out.println("select count:" + moveCount);
        return s;
    }
}