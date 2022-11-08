package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductExceptSelfTests {
    ProductExceptSelf solution = new ProductExceptSelf();

    @Test
    void testProductExceptSelf() {
        int[] param = new int[] { -1, 1, 0, -3, 3 };
        int[] result = solution.productExceptSelf(param);
        assertArrayEquals(new int[] { 0, 0, 9, 0, 0 }, result);
    }

    @Test
    void testProductExceptSelf1() {
        int[] param = new int[] { 1, 2, 3, 4 };
        int[] result = solution.productExceptSelf(param);
        assertArrayEquals(new int[] { 24, 12, 8, 6 }, result);
    }
}
