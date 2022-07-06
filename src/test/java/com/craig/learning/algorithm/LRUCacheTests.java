package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LRUCacheTests {
    

    @Test
    void lruCacheTest(){
        LRUCache lruCache = new LRUCache(2);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1,  lruCache.get(1));
        lruCache.put(3, 3);

        assertEquals(-1, lruCache.get(2));

        lruCache.put(4, 4); 

        assertEquals(-1, lruCache.get(1));  
        assertEquals(3, lruCache.get(3)); 
        assertEquals(4, lruCache.get(4));
    }    

    @Test
    void lruCacheTest1(){
        LRUCache lruCache = new LRUCache(2);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1,  lruCache.get(1));
        lruCache.put(3, 3);

        assertEquals(-1, lruCache.get(2));

        lruCache.put(4, 4); 

        assertEquals(-1, lruCache.get(1));  
        assertEquals(3, lruCache.get(3)); 
        assertEquals(4, lruCache.get(4));
    }
}
