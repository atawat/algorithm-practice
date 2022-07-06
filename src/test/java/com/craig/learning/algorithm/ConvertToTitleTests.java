package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertToTitleTests {
    ConvertToTitle solution = new ConvertToTitle();
    @Test
    void testConvertToTitle() {
        assertEquals("AAY", solution.convertToTitle(727)); 
    }   
    
    @Test
    void testConvertToTitle1() {
        assertEquals("ZY", solution.convertToTitle(701)); 
    }    

    @Test
    void testConvertToTitle2() {
        assertEquals("AZ", solution.convertToTitle(52)); 
    }
}
