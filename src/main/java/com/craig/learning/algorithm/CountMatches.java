package com.craig.learning.algorithm;

import java.util.List;

/**
 * https://leetcode.cn/problems/count-items-matching-a-rule/
 * 1773. 统计匹配检索规则的物品数量
 */
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int attrIndex = -1;
        switch(ruleKey){
            case "type":
                attrIndex = 0;
                break;
            case "color":
                attrIndex = 1;
                break;
            case "name":
                attrIndex = 2;
                break;
        }
        for(List<String> item : items){
            String attr = item.get(attrIndex);
            if(ruleValue.equals(attr)){
                count++;
            }
        }
        
        return count;
    }
}
