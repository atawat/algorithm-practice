package com.craig.learning.algorithm;

import javax.swing.ToolTipManager;

import org.yaml.snakeyaml.tokens.TagToken;

/**
 * 分发糖果
 * https://leetcode.cn/problems/candy/
 */
public class Candy {
    // 判断递增递减 过于复杂
    // public int candy(int[] ratings) {
    //     int total = 0;
    //     int count = 0;
    //     int diretion = 0; // 方向 0 水平，1 递增， 2递减
    //     for (int i = 0; i < ratings.length; i++) {
    //         count++;
    //         if (i == 0) {
    //             continue;
    //         }

    //         if(ratings[i] > ratings[i-1]){
    //             if(ratings[i] < ratings[i+1]){
    //                 diretion = 1;
    //                 continue;
    //             }
    //             if(ratings[i] == ratings[i+1]){
    //                 diretion = 0;
    //             }else{
    //                 diretion = -1;
    //             }
    //             //拐点
    //             total += count * (count+1) /2;
    //             count =0;
    //         } else if (ratings[i] == ratings[i-1] && ratings[i] <= ratings[i+1]) {
    //             total++;
    //             if(ratings[i] == ratings[i+1])
    //                 count =0;
    //             else
    //                 count = 1;
    //         }else {
    //             if(ratings[i] > ratings[i+1]){
    //                 diretion = -1;
    //                 continue;
    //             }
    //             if(ratings[i] == ratings[i+1]){
    //                 diretion = 0;
    //             }else{
    //                 diretion = 1;
    //             }
    //             total += count * (count+1) /2;
    //             count =0;
    //         }
    //     }

    //     return total;
    // }

    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        
        for (int i = 0; i < candy.length; i++) {
            candy[i] = 1;
        }

        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }

        int total = candy[ratings.length-1];
        for (int i = ratings.length-2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i], candy[i+1] + 1);
            }
            total += candy[i];
        }

        return total;
    }
}
