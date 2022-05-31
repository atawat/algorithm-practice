package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {

    class KeyWord implements Comparable<KeyWord>{
        protected String key;

        protected int frequence ;

        protected int index;

        public KeyWord(String key) {
            this.key = key;
            this.frequence = 1;
        }

        @Override
        public int compareTo(KeyWord o) {
            if(o == null){
                return 1;
            }
            int result = this.frequence - o.frequence != 0 ? this.frequence - o.frequence : -this.key.compareTo(o.key);
            return result;
        }
    }

    class KeyWordHeap {
        private KeyWord[] heapArray;

        private Map<String, KeyWord> keyWordMap = new HashMap<>();

        private int heapSize;

        public KeyWordHeap(int maxHeapSize) {
            heapArray = new KeyWord[maxHeapSize];
        }

        public KeyWord insert(String key) {
            KeyWord keyWord = keyWordMap.get(key);
            if (keyWord == null) {
                keyWord = new KeyWord(key);
                keyWordMap.put(key, keyWord);
                insertHeap(keyWord);
            } else {
                keyWord.frequence++;
                increaseKey(keyWord);
            }

            return keyWord;
        }

        public KeyWord insertHeap(KeyWord keyWord) {
            heapArray[heapSize] = keyWord;
            keyWord.index = heapSize;
            heapSize++;
            increaseKey(keyWord);

            return keyWord;
        }

        public KeyWord popTop() {
            if (heapSize <= 0) {
                return null;
            }
            KeyWord top = heapArray[0];
            if (heapSize > 1) {
                KeyWord last = heapArray[heapSize - 1];
                exchange(top, last);
            }
            heapArray[heapSize - 1] = null;
            heapSize--;

            maxHeapify(0);

            top.index = -1;
            return top;
        }

        private KeyWord getRight(int i) {
            int index = 2 * i + 2;
            if (i >= heapSize || index > heapSize) {
                return null;
            }
            return get(index);
        }

        private KeyWord getLeft(int i) {
            int index = 2 * i + 1;
            if (i >= heapSize || index > heapSize) {
                return null;
            }
            return get(index);
        }

        private KeyWord getParent(int i) {
            int index = (int) Math.ceil(i / 2.0) - 1;
            if (index >= heapSize) {
                return null;
            }
            return get(index);
        }

        private KeyWord get(int i) {
            if (i < 0 || i >= heapSize) {
                return null;
            }
            return heapArray[i];
        }

        private void maxHeapify(KeyWord keyWord) {
            maxHeapify(keyWord.index);
        }

        private void maxHeapify(int i) {
            KeyWord self = get(i);
            if(self == null){
                return;
            }

            
            KeyWord left = getLeft(i);
            KeyWord right = getRight(i);
            
            
            KeyWord exchange = self;
            if (left != null && exchange.compareTo(left) < 0) {
                exchange = left;
            } 
            if (right != null && exchange.compareTo(right) < 0) {
                exchange = right;
            } 

            if(exchange != self){
                exchange(self, exchange);
                maxHeapify(self);
            }            
        }

        private void increaseKey(KeyWord key){
            KeyWord parent = getParent(key.index);
            while (parent != null && key.compareTo(parent) > 0) {
                exchange(key, parent);
                parent = getParent(key.index);
            } 
        }

        private void exchange(KeyWord k1, KeyWord k2) {

            heapArray[k1.index] = k2;
            heapArray[k2.index] = k1;

            int temp = k1.index;
            k1.index = k2.index;
            k2.index = temp;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {

        KeyWordHeap heap = new KeyWordHeap(words.length);
        for (String key : words) {
            heap.insert(key);
        }
        List<String> result = new ArrayList<>();
        for (int i = k; i > 0; i--) {
            KeyWord top = heap.popTop();
            result.add(top.key);
        }

        return result;
    }
}
