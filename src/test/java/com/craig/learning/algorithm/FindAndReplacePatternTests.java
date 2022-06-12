package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FindAndReplacePatternTests {
    FindAndReplacePattern solution = new FindAndReplacePattern();

    @Test
    void testFindAndReplacePattern() {
        List<String> result = solution.findAndReplacePattern(new String[]{"abccbd","atxxta","xyzzyx","abcdxy"}, "abccba");
        
        assertEquals(2, result.size());
        assertEquals(result.get(0), "atxxta");
        assertEquals(result.get(1), "xyzzyx");
    }   
    
    @Test
    void testFindAndReplacePattern1() {
        List<String> result = solution.findAndReplacePattern(new String[]{"abccbd","ttxxaa","yyggcc","yyggyy"}, "aabbcc");
        
        assertEquals(2, result.size());
        assertEquals(result.get(0), "ttxxaa");
        assertEquals(result.get(1), "yyggcc");
    }    
    
    @Test
    void testFindAndReplacePattern2() {
        List<String> result = solution.findAndReplacePattern(new String[]{"abccba","loppol","zyxxyz","zyxzyx"}, "xyzzyx");
        
        assertEquals(3, result.size());
        assertEquals(result.get(0), "abccba");
        assertEquals(result.get(1), "loppol");
        assertEquals(result.get(2), "zyxxyz");
    }
}
