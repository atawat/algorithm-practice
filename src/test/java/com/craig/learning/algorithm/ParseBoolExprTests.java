package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ParseBoolExprTests {
    ParseBoolExpr solution = new ParseBoolExpr();

    @Test
    void testParseBoolExpr() {
        assertFalse(solution.parseBoolExpr("|(&(t,f,t),!(t))"));
    }

    @Test
    void testParseBoolExpr1() {
        assertFalse(solution.parseBoolExpr("&(t,f)"));
    }

    @Test
    void testParseBoolExpr2() {
        assertTrue(solution.parseBoolExpr("|(f,t)"));
    }

    @Test
    void testParseBoolExpr3() {
        assertTrue(solution.parseBoolExpr("!(f)"));
    }

    @Test
    void testParseBoolExpr4() {
        assertFalse(solution.parseBoolExpr("&(|(f))"));
    }
}
