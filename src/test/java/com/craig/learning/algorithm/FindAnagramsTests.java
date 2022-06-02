package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;

public class FindAnagramsTests {

    FindAnagrams solution = new FindAnagrams();

    @Test
    void testFindAnagrams() {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = solution.findAnagrams(s, p);

        List<Integer> target = new ArrayList<>(){
            {
                add(0);
                add(6);
            }
        };
        assertEquals(target, result);
    }

    @Test
    void testFindAnagrams1() {
        String s = "abab";
        String p = "ab";

        List<Integer> result = solution.findAnagrams(s, p);

        List<Integer> target = new ArrayList<>(){
            {
                add(0);
                add(1);
                add(2);
            }
        };
        assertEquals(target, result);
    }

    @Test
    void testFindAnagrams2() {
        String s = "abcxabc";
        String p = "abc";

        List<Integer> result = solution.findAnagrams(s, p);

        List<Integer> target = new ArrayList<>(){
            {
                add(0);
                add(4);
            }
        };
        assertEquals(target, result);
    } 
    
    @Test
    void testFindAnagrams3() {
        String s = "abacbabc";
        String p = "abc";

        List<Integer> result = solution.findAnagrams(s, p);

        List<Integer> target = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
                add(5);
            }
        };
        assertEquals(target, result);
    }

}
