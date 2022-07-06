package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CountInversionsTests {
    @Test
    void CountInversionsTests(){
        List<Integer> source = new ArrayList<>(){{
            add(2);
            add(1);
            add(3);
            add(1);
            add(2);
        }};
        assertEquals(4, CountInversions.countInversions(source)); 
    }
}
