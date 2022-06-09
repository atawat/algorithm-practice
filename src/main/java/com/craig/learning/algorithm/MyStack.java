package com.craig.learning.algorithm;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 队列实现栈
 * https://leetcode.cn/problems/implement-stack-using-queues/
 */
public class MyStack {
    Queue<Integer> main = new LinkedBlockingQueue<>();
    public MyStack() {

    }
    
    public void push(int x) {
        if(main.isEmpty()){
            main.add(x);
            return;
        }
        int size = main.size();
        main.add(x);
        for (int i = 0; i < size; i++) {
            main.add(main.poll());
        }
    }
    
    public int pop() {
        return main.poll();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}
