package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 课程表
 * https://leetcode.cn/problems/course-schedule/
 */
public class CanFinish {
    List<List<Integer>> edges = new ArrayList<>();
    int[] state;
    boolean valid = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) { 
        state = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges.add(i, new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            dfs(i);
        }

        return valid;
    }

    private void dfs(int target){
        if(state[target] == 2){
            return;
        }
        state[target] = 1; //标记节点为状态1 搜索中
        for(Integer v: edges.get(target)){
            if(state[v] == 1){
                valid = false;
                return;
            }
            dfs(v);
            if(valid == false){
                return;
            }
        }
        
        state[target] = 2; //标记节点为状态2 搜索完成
    }
}
