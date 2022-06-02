package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CommonCharsTests {
    CommonChars solution = new CommonChars();
    @Test
    void testCommonChars() {
        String[] words = new String[] {"bella","label","roller"};
        List<String> result = solution.commonChars(words);
        String[] expect = new String[]{"e","l","l"};
        String[] resultArray = new String[result.size()];
        result.toArray(resultArray);
        assertArrayEquals(expect, resultArray);
    }
}
