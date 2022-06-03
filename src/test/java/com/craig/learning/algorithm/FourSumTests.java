package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FourSumTests {
    FourSum solution = new FourSum();

    @Test
    public void fourSumTest() {
        int[] source = new int[] { 2, 2, 2, 2, 2 };
        int target = 8;
        List<List<Integer>> result = solution.fourSum(source, target);
        List<List<Integer>> expect = new ArrayList<>() {
            {
                add(List.of(2, 2, 2, 2));
            }
        };
        assertEquals(expect, result);
    }

    @Test
    public void fourSumTest1() {
        int[] source = new int[] { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> result = solution.fourSum(source, target);
        List<List<Integer>> expect = new ArrayList<>() {
            {
                add(List.of(-2, -1, 1, 2));
                add(List.of(-2, 0, 0, 2));
                add(List.of(-1, 0, 0, 1));
            }
        };
        assertEquals(expect, result);
    }

    @Test
    public void fourSumTest2() {
        int[] source = new int[] { 1, -2, -5, -4, -3, 3, 3, 5 };
        int target = -11;
        List<List<Integer>> result = solution.fourSum(source, target);
        List<List<Integer>> expect = new ArrayList<>() {
            {
                add(List.of(-5,-4,-3,1));
            }
        };
        assertEquals(expect, result);
    }
}
