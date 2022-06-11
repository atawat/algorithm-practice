package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TopKFrequentWordsTests {
    @Test
    void testTopKWordsFrequent() {
        TopKFrequentWords solution = new TopKFrequentWords();
        String[] source = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        String[] source2 = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        String[] source4 = new String[]{"glarko","zlfiwwb","nsfspyox","pwqvwmlgri","qggx",
        "qrkgmliewc","zskaqzwo","zskaqzwo","ijy","htpvnmozay","jqrlad","ccjel","qrkgmliewc","qkjzgws","fqizrrnmif","jqrlad","nbuorw","qrkgmliewc","htpvnmozay",
        "nftk","glarko","hdemkfr","axyak","hdemkfr","nsfspyox","nsfspyox","qrkgmliewc","nftk","nftk","ccjel","qrkgmliewc","ocgjsu","ijy","glarko",
        "nbuorw","nsfspyox","qkjzgws","qkjzgws","fqizrrnmif","pwqvwmlgri","nftk","qrkgmliewc","jqrlad","nftk","zskaqzwo","glarko",
        "nsfspyox","zlfiwwb","hwlvqgkdbo","htpvnmozay","nsfspyox","zskaqzwo","htpvnmozay",
        "zskaqzwo","nbuorw","qkjzgws","zlfiwwb","pwqvwmlgri","zskaqzwo","qengse","glarko",
        "qkjzgws","pwqvwmlgri","fqizrrnmif","nbuorw","nftk","ijy","hdemkfr","nftk","qkjzgws","jqrlad","nftk",
        "ccjel","qggx","ijy","qengse","nftk","htpvnmozay","qengse","eonrg","qengse","fqizrrnmif","hwlvqgkdbo",
        "qengse","qengse","qggx","qkjzgws","qggx","pwqvwmlgri","htpvnmozay","qrkgmliewc","qengse","fqizrrnmif",
        "qkjzgws","qengse","nftk","htpvnmozay","qggx","zlfiwwb","bwp","ocgjsu","qrkgmliewc","ccjel","hdemkfr",
        "nsfspyox","hdemkfr","qggx","zlfiwwb","nsfspyox","ijy","qkjzgws","fqizrrnmif","qkjzgws","qrkgmliewc","glarko","hdemkfr","pwqvwmlgri"};
        
        List<String> result = solution.topKFrequent(source, 2);
        assertArrayEquals(new String[]{"i", "love"}, result.toArray());

        List<String> result2 = solution.topKFrequent(source2, 4);
        assertArrayEquals(new String[]{"the", "is", "sunny", "day"}, result2.toArray());

        List<String> result3 = solution.topKFrequent(source, 3);
        assertArrayEquals(new String[]{"i","love","coding"}, result3.toArray());

        List<String> result4 = solution.topKFrequent(source4, 14);
        assertArrayEquals(new String[]{"nftk","qkjzgws","qrkgmliewc","nsfspyox","qengse","htpvnmozay","fqizrrnmif","glarko","hdemkfr","pwqvwmlgri","qggx","zskaqzwo","ijy","zlfiwwb"}, result4.toArray());
    }
}
