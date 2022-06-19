package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindItineraryTests {
    FindItinerary solution = new FindItinerary();

    @Test
    void testFindItinerary() {
        List<List<String>> testSouce = new ArrayList<>(){{
            add(List.of("JFK","SFO"));
            add(List.of("JFK","ATL"));
            add(List.of("SFO","ATL"));
            add(List.of("ATL","JFK"));
            add(List.of("ATL","SFO"));
        }};
        List<String> result = solution.findItinerary(testSouce);
        assertEquals(6, result.size());
    }

    @Test
    void testFindItinerary2() {
        List<List<String>> testSouce = new ArrayList<>(){{
            add(List.of("MUC","LHR"));
            add(List.of("JFK","MUC"));
            add(List.of("SFO","SJC"));
            add(List.of("LHR","SFO"));
        }};
        List<String> result = solution.findItinerary(testSouce);
        assertEquals(5, result.size());
    }    
    
    @Test
    void testFindItinerary3() {
        List<List<String>> testSouce = new ArrayList<>(){{
            add(List.of("JFK","KUL"));
            add(List.of("JFK","NRT"));
            add(List.of("NRT","JFK"));
        }};
        List<String> result = solution.findItinerary(testSouce);
        assertEquals(4, result.size());
    }
}
