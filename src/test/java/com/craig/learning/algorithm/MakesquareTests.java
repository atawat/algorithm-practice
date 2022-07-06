package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class MakesquareTests {
    Makesquare solution = new Makesquare();

    @Test
    void testMakesquare() {
        int[] matchsticks = new int[] { 1, 1, 2, 2, 2 };
        assertEquals(true, solution.makesquare(matchsticks));

        int[] matchsticks1 = new int[] { 1, 4, 2, 1, 2, 2, 2, 1, 1 };
        assertEquals(true, solution.makesquare(matchsticks1));

        int[] falstGroup = new int[] { 3, 3, 3, 3, 4 };
        assertEquals(false, solution.makesquare(falstGroup));

        int[] falstGroup1 = new int[] { 6, 2, 3, 5 };
        assertEquals(false, solution.makesquare(falstGroup1));

        int[] trueGroup = new int[] { 5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3 };
        assertEquals(true, solution.makesquare(trueGroup));

        int[] trueGroup2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        assertEquals(true, solution.makesquare(trueGroup2));

        int[] trueGroup3 = new int[] { 10, 6, 5, 5, 5, 3, 3, 3, 2, 2, 2, 2 };
        assertEquals(true, solution.makesquare(trueGroup3));        
        
        int[] trueGroup4 = new int[] { 12,18,2,2,16,8,7,3,10,12,3,20,2,10,19 };
        assertEquals(true, solution.makesquare(trueGroup4));

        int[] trueGroup5 = new int[] { 13,11,1,8,6,7,8,8,6,7,8,9,8};
        assertEquals(true, solution.makesquare(trueGroup5));
    }

    @Test
    void recursiveTest() {
        int[] trueGroup = new int[] { 10, 6, 5, 5, 5, 3, 3, 3, 2, 2, 2, 2 };
        Arrays.sort(trueGroup);
        Set<Integer> used = new HashSet<Integer>();
        boolean result = solution.findCombineTarget(trueGroup.length - 1, 12, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result);

        boolean result1 = solution.findCombineTarget(trueGroup.length - 1, 12, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result1);

        boolean resul2 = solution.findCombineTarget(trueGroup.length - 1, 12, trueGroup, used);
        System.out.println(used);
        assertEquals(true, resul2);

        boolean result3 = solution.findCombineTarget(trueGroup.length - 1, 12, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result3);
    }

    @Test
    void recursiveTest1() {
        int[] trueGroup = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Arrays.sort(trueGroup);
        Set<Integer> used = new HashSet<Integer>();
        boolean result = solution.findCombineTarget(trueGroup.length - 1, 30, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result);

        boolean result1 = solution.findCombineTarget(trueGroup.length - 1, 30, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result1);

        boolean resul2 = solution.findCombineTarget(trueGroup.length - 1, 30, trueGroup, used);
        System.out.println(used);
        assertEquals(true, resul2);

        boolean result3 = solution.findCombineTarget(trueGroup.length - 1, 30, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result3);
    }   
    
    @Test
    void recursiveTest2() {
        int[] trueGroup = new int[] { 12,18,2,2,16,8,7,3,10,12,3,20,2,10,19};
        Arrays.sort(trueGroup);
        trueGroup.toString();
        int sumTarget = Arrays.stream(trueGroup).sum() / 4 ;
        System.out.println("target array:" + trueGroup + ", sum = " + sumTarget);
        Set<Integer> used = new HashSet<Integer>();
        boolean result = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result);

        boolean result1 = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result1);

        boolean resul2 = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, resul2);

        boolean result3 = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result3);
    }    
    
    @Test
    void recursiveTest3() {
        int[] trueGroup = new int[] { 13,11,1,8,6,7,8,8,6,7,8,9,8};
        Arrays.sort(trueGroup);
        trueGroup.toString();
        int sumTarget = Arrays.stream(trueGroup).sum() / 4 ;
        System.out.println("target array:" + trueGroup + ", sum = " + sumTarget);
        Set<Integer> used = new HashSet<Integer>();
        boolean result = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result);

        boolean result1 = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result1);

        boolean resul2 = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, resul2);

        boolean result3 = solution.findCombineTarget(trueGroup.length - 1, sumTarget, trueGroup, used);
        System.out.println(used);
        assertEquals(true, result3);
    }
}
