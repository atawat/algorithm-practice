package com.craig.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.craig.learning.algorithm.CombinationSum;

public class CombinationSumTests {
    CombinationSum solution = new CombinationSum();
    
    @Test
    void combinationSumTest(){
       List<List<Integer>> result =  solution.combinationSum(new int[]{2,3,6,7}, 7);

       assertEquals(2, result.size());
    }  

    @Test
    void combinationSumTest1(){
       List<List<Integer>> result =  solution.combinationSum(new int[]{2,3,5}, 8);

       assertEquals(3, result.size());
    }
}
