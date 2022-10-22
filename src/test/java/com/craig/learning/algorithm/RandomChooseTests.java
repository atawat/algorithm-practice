package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RandomChooseTests {
    RandomChoose solution = new RandomChoose();

    @Test
    void testChoose() {
        String sentence = "this is a sentence it is not a good one and it is also bad";
        String result = solution.choose(sentence, 5);
        System.out.println(result);
        assertEquals(5, result.split(" ").length); 
    }

    @Test
    void indexTest(){
        String sentence = "this is a sentence it is not a good one and it is also bad";
        int val = sentence.indexOf("it is");
        int val1 = sentence.indexOf("it is", val);
    }
}
