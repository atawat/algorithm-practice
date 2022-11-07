package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class AmbiguousCoordinatesTests {
    AmbiguousCoordinates solution = new AmbiguousCoordinates();

    @Test
    void testAmbiguousCoordinates() {
        List<String> result = solution.ambiguousCoordinates("(100)");

        assertEquals(1, result.size());
    }

    @Test
    void testAmbiguousCoordinates2() {
        List<String> result = solution.ambiguousCoordinates("(0123)");

        assertEquals(6, result.size());
    }
    
    @Test
    void testAmbiguousCoordinates3() {
        List<String> result = solution.ambiguousCoordinates("(123)");

        assertEquals(4, result.size());
    }

    @Test
    void testAmbiguousCoordinates4() {
        List<String> result = solution.ambiguousCoordinates("(00011)");

        assertEquals(2, result.size());
    }
}
