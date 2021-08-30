package com.DesignPatterns.BehaviouralPatterns.iterator;

import java.util.Stack;

public class StackIterator<T> implements Iterator<T> {

    private Stack<T> stack;

    public StackIterator(Stack<T> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public void next() {
        stack.pop();
    }

    @Override
    public T current() {
        return stack.peek();
    }
}
