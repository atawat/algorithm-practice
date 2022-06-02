package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsAnagramTests {
    IsAnagram solution = new IsAnagram();

    @Test
    void testIsAnagram() {
        String a = "anagram";
        String b = "nagaram";

        assertEquals(true, solution.isAnagram(a, b));
    }


    @Test
    void testIsAnagram1() {
        String a = "a";
        String b = "ab";

        assertEquals(false, solution.isAnagram(a, b));
    }
}
