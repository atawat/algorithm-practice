package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CountMatchesTests {
    @Test
    void testCountMatches() {
        List<List<String>> test1 = List.of(
            List.of("phone","blue","pixel"),
            List.of("computer","silver","lenovo"),
            List.of("phone","gold","iphone")
            );
        CountMatches solution = new CountMatches();
        assertEquals(1, solution.countMatches(test1, "color", "silver"));
    }
}
