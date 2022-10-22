package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidIPAddressTests {
    ValidIPAddress solution = new ValidIPAddress();

    @Test
    void testValidIPAddress() {
        assertEquals("IPv4", solution.validIPAddress("255.255.255.255"));
        assertEquals("IPv4", solution.validIPAddress("255.255.0.0"));
        assertEquals("IPv4", solution.validIPAddress("1.12.123.0"));
    }    
    
    @Test
    void testValidIPAddress2() {
        assertEquals("IPv6", solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("IPv6", solution.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
    }

        
    @Test
    void testValidIPAddress3() {
        //assertEquals("Neither", solution.validIPAddress("2001:0db8:85a3::8A2E:037j:7334"));
        //assertEquals("Neither", solution.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        assertEquals("Neither", solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }
}
