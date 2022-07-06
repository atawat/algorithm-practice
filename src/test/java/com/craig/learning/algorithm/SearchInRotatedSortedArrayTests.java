package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTests {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
    @Test
    void testSearch() {
       assertEquals(7, solution.search(new int[]{5,6,7,8,9,10,11,12,1,2,3,4}, 12));  
    }    
    
    @Test
    void testSearch1() {
       assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));  
    }   

    @Test
    void testSearch2() {
       assertEquals(2, solution.search(new int[]{5,1,3}, 3));  
    }   
    
    @Test
    void testSearch3() {
       assertEquals(0, solution.search(new int[]{5,1,3}, 5));  
    }   

    @Test
    void testSearch4() {
       assertEquals(1, solution.search(new int[]{5,6,3}, 6));  
    }    
    
    @Test
    void testSearch5() {
       assertEquals(0, solution.search(new int[]{5,6,3}, 5));  
    }  

    @Test
    void testSearch6() {
       assertEquals(2, solution.search(new int[]{5,6,3}, 3));  
    }

    @Test
    void testSearch7() {
       assertEquals(2, solution.search(new int[]{5,6,3,4}, 3));  
    }

    @Test
    void testSearch8() {
       assertEquals(1, solution.search(new int[]{5,6,3,4}, 6));  
    }
}
