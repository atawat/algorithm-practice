package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EvalRPNTests {
    EvalRPN solution = new EvalRPN();

    @Test
    void testEvalRPN() {
        String[] p1 = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22, solution.evalRPN(p1)); 
    }
}
