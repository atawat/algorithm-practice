package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindLUSlengthTests {
    FindLUSlength solution =new FindLUSlength();
    @Test
    void testFindLUSlength() {
        assertEquals(-1, solution.findLUSlength(new String[]{"aaa","aaa","aa"}));
    }
}
