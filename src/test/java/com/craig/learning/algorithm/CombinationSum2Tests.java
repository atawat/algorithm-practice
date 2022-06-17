package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CombinationSum2Tests {
    CombinationSum2 solution = new CombinationSum2();
    
    @Test
    void combinationSum2Test(){
       List<List<Integer>> result= solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);

       assertEquals(4, result.size());
    }

    @Test
    void combinationSum2Test2(){
       List<List<Integer>> result= solution.combinationSum2(new int[]{2,5,2,1,2}, 5);

       assertEquals(2, result.size());
    }
}
