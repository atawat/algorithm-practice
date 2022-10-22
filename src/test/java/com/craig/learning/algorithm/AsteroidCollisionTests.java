package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AsteroidCollisionTests {
    AsteroidCollision solution  = new AsteroidCollision();

    @Test
    void testAsteroidCollision() {
        assertArrayEquals(new int[]{5,10}, solution.asteroidCollision(new int[]{5,10,-5}));
    }

    @Test
    void testAsteroidCollision2() {
        assertArrayEquals(new int[]{}, solution.asteroidCollision(new int[]{8,-8}));
    }

    @Test
    void testAsteroidCollision3() {
        assertArrayEquals(new int[]{10}, solution.asteroidCollision(new int[]{10,2,-5}));
    }

    @Test
    void testAsteroidCollision4() {
        assertArrayEquals(new int[]{-10,6,8}, solution.asteroidCollision(new int[]{-10,6,2,-5,8}));
    }

    @Test
    void testAsteroidCollision5() {
        assertArrayEquals(new int[]{-2,1,2,1}, solution.asteroidCollision(new int[]{-2,1,2,1}));
    }
}
