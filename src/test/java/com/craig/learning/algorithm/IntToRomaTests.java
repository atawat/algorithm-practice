package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.DocFlavor.STRING;

import org.junit.jupiter.api.Test;

public class IntToRomaTests {
    
    @Test
    public void testIntToRoma() {
        IntToRoma solution = new IntToRoma();
        int nums = 1994;
        String result = solution.intToRoman(nums);
        assertEquals("MCMXCIV", result);
    }

    @Test
    public void testRomatToInt(){
        IntToRoma solution = new IntToRoma();
        assertEquals(1994, solution.romanToInt("MCMXCIV")); 

        assertEquals(4, solution.romanToInt("IV")); 
    }
}
