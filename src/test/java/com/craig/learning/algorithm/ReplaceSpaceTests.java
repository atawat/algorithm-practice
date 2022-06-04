package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReplaceSpaceTests {
    ReplaceSpace solution = new ReplaceSpace();
    @Test
    void testReplaceSpace() {
       assertEquals("We%20are%20happy.", solution.replaceSpace("We are happy.")); 
    }
    
    @Test
    void testReplaceSpaceWithoutSpace() {
       assertEquals("We%20are%20happy.", solution.replaceSpaceWithoutSpace("We are happy.")); 
    }
}
