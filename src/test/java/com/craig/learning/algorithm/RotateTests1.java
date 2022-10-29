package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RotateTests1 {

    @Test
    public void test1() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] newArray = Rotate1.rotate(array, 4);
        assertArrayEquals(new int[] {4,5,6,7,1,2,3}, newArray);
    }
}
