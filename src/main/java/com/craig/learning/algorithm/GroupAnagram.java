package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 字母异位词分组
 * https://leetcode.cn/problems/group-anagrams/
 */
public class GroupAnagram {
    Map<AnagramString, List<String>> readMap = new LinkedHashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            AnagramString key = new AnagramString(strs[i]);
            putKey(key);
        }
        return new ArrayList<List<String>>(readMap.values());
    }

    private void putKey(AnagramString key) {

        List<String> list = readMap.get(key);
        if (list == null) {
            list = new ArrayList<>();
            readMap.put(key, list);
        }
        list.add(key.orignal);
    }


    class AnagramString {

        String orignal;

        String  hashCodeString;

        public int[] map = new int[26];

        public AnagramString(String s) {
            orignal = s;
            
            for (char c : s.toCharArray()) {
                int i = Integer.valueOf(c) - Integer.valueOf('a');
                map[i]++;
            }
            StringBuilder builder  = new StringBuilder();
            for(int i= 0; i<map.length;i++){
                if(map[i]>0){
                    builder.append( (char)('a' + i));
                    builder.append(map[i]);
                }
            }
            hashCodeString = builder.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof String) {
                return equals(new AnagramString((String) obj));
            } else if (!(obj instanceof AnagramString)) {
                return false;
            }
            AnagramString objString = (AnagramString) obj;
            if(objString.orignal.length() != this.orignal.length()){
                return false;
            }
            
            return objString.hashCodeString.equals(this.hashCodeString);
        }

        @Override
        public int hashCode() {
            return hashCodeString.hashCode();
        }

    }
}
