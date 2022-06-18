package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RestoreIpAddressesTests {
    RestoreIpAddresses solution = new RestoreIpAddresses();

    @Test
    void testRestoreIpAddresses() {
        List<String> result = solution.restoreIpAddresses("25525511135");

        assertEquals(2, result.size());
    }   
    
    @Test
    void testRestoreIpAddresses1() {
        List<String> result = solution.restoreIpAddresses("0000");

        assertEquals(1, result.size());
    }    

    @Test
    void testRestoreIpAddresses2() {
        List<String> result = solution.restoreIpAddresses("101023");

        assertEquals(5, result.size());
    }

    @Test
    void testRestoreIpAddresses3() {
        List<String> result = solution.restoreIpAddresses("172162541");

        assertEquals(6, result.size());
    }

    
    @Test
    void testRestoreIpAddresses4() {
        List<String> result = solution.restoreIpAddresses("000256");

        assertEquals(0, result.size());
    }
}
