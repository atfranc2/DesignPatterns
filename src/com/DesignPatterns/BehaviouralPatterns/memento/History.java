package com.DesignPatterns.BehaviouralPatterns.memento;

import java.util.Stack;

public class History<T> {
    private Stack<T> history = new Stack<T>();

    public void push(T state) {
        history.push(state);
    }

    public T pop() {
        return history.pop();
    }
}
