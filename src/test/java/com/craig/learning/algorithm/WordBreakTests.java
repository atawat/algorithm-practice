package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WordBreakTests {
    WordBreak solution = new WordBreak();

    @Test
    void testWordBreak() {
        List<String> dict =  new ArrayList<>(){{ add("aaaa"); add("aaa");}};
        assertTrue(solution.wordBreak("aaaaaaa", dict));
    }
}
