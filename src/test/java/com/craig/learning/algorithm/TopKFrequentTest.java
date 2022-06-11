package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TopKFrequentTest {
    TopKFrequent solution = new TopKFrequent();

    // @Test
    // public void TopKFrequentTest(){
    //    assertArrayEquals(new int[]{2,1}, solution.topKFrequent(new int[]{1,1,1,2,2,3}, 2));  
    // }

    // @Test
    // public void TopKFrequentTest1(){
    //    assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1}, 1));  
    // }

    // @Test
    // public void TopKFrequentTest2(){
    //    assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1,1}, 1));  
    // }

    // @Test
    // public void TopKFrequentTest3(){
    //    assertArrayEquals(new int[]{0}, solution.topKFrequent(new int[]{3,0,1,0}, 1));  
    // }   
    
    @Test
    public void TopKFrequentTest(){
       assertArrayEquals(new int[]{2,1}, solution.topKFrequent2(new int[]{1,1,1,2,2,3}, 2));  
    }

    @Test
    public void TopKFrequentTest1(){
       assertArrayEquals(new int[]{1}, solution.topKFrequent2(new int[]{1}, 1));  
    }

    @Test
    public void TopKFrequentTest2(){
       assertArrayEquals(new int[]{1}, solution.topKFrequent2(new int[]{1,1}, 1));  
    }

    @Test
    public void TopKFrequentTest3(){
       assertArrayEquals(new int[]{0}, solution.topKFrequent2(new int[]{3,0,1,0}, 1));  
    }
}
