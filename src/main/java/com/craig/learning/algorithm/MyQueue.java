package com.craig.learning.algorithm;

import java.util.Stack;

/**
 * 栈实现队列
 * https://leetcode.cn/problems/implement-queue-using-stacks/
 */
public class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public MyQueue() {

    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        if(!out.empty()){
            return out.pop();
        }
        transferStack();
        return out.pop();
    }
    
    public int peek() {
        if(empty()){
            return -1;
        }
        if(!out.empty()){
            return out.peek();
        }
        transferStack();
        return out.peek();
    }

    private void transferStack() {
        int size = in.size();
        for (int i = 0; i < size; i++) {
            out.push(in.pop());
        }
    }
    
    public boolean empty() {
        return in.empty() && out.empty();
    }
}
