package com.craig.learning.algorithm;

/**
 * 波场一面，翻转数组
 */
public class Rotate1 {
    public static int[] rotate(int[] array, int k) {
        int j = 0;
        int[] temp = new int[k];
        for(int i = array.length - k; i< array.length; i++){
            temp[j++] = array[i];
        }
        for(int i = array.length-1; i >= k; i--){
            array[i] = array[i-k];
        }
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
        
        return array;
    }
}