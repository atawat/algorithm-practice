package com.craig.learning.algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddStringsTests {
    AddStrings solution = new AddStrings();

    @Test
    void testAddStrings() {
        assertEquals("234", solution.addStrings("111", "123"));
    }

    @Test
    void testAddStrings2() {
        assertEquals("533", solution.addStrings("456", "77"));
    }

    @Test
    void testAddStrings3() {
        assertEquals("0", solution.addStrings("0", "0"));
    }

    @Test
    void testAddStrings4() {
        assertEquals("10", solution.addStrings("1", "9"));
    }
}
