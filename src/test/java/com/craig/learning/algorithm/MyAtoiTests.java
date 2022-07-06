package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyAtoiTests {
    MyAtoi solution = new MyAtoi();

    @Test
    void myAtoiTest(){
        assertEquals(100001, solution.myAtoi("100001")); 
    }

    @Test
    void myAtoiTest1(){
        assertEquals(-100001, solution.myAtoi("      -100001")); 
    }
    
    @Test
    void myAtoiTest2(){
        assertEquals(-100001, solution.myAtoi("      -100001  with")); 
    }   

    @Test
    void myAtoiTest3(){
        assertEquals(0, solution.myAtoi("words and 987")); 
    }

    @Test
    void myAtoiTest4(){
        assertEquals(0, solution.myAtoi("+-12")); 
    }

    @Test
    void myAtoiTest5(){
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("9223372036854775808")); 
    }
}
