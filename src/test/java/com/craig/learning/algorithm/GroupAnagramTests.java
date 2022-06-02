package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GroupAnagramTests {
    GroupAnagram solution = new GroupAnagram();

    @Test
    void testGroupAnagrams() {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat","abcd","bcad"};
        List<List<String>> result = solution.groupAnagrams(input);
        String[][] target = new String[][]{            
            {"eat","tea","ate"},
            {"tan","nat"},
            {"bat"},
            {"abcd","bcad"}
        };
        assertArrayEquals(target, convertResult(result));
    }   
    
    @Test
    void testGroupAnagrams2() {
        String[] input = new String[]{"huh","tit"};
        List<List<String>> result = solution.groupAnagrams(input);
        String[][] target = new String[][]{            
            {"huh"},
            {"tit"},
        };
        assertArrayEquals(target, convertResult(result));
    }

    @Test
    void testGroupAnagrams1() {
        String[] input = new String[]{"a"};
        List<List<String>> result = solution.groupAnagrams(input);
        String[][] target = new String[][]{
            {"a"},
        };
        assertArrayEquals(target, convertResult(result));
    }


    private String[][] convertResult(List<List<String>> source){
        String[][] result = new String[source.size()][];
        int i =0;
        for(List<String> array : source){
            String[] arrayType = new String[array.size()];
            result[i++] = array.toArray(arrayType);
        }

        return result;
    }
}
