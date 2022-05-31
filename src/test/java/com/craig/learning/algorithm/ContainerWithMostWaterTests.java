package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTests {
    
    @Test
    void testMaxArea() {
        ContainerWithMostWater algorithm = new ContainerWithMostWater();
        int[] testArray = {99,8,6,2,4,10,8,99,7};

        int area = algorithm.maxArea(testArray);
        System.out.print("get max area " + area);

        assertEquals(693, area);
    }
}
