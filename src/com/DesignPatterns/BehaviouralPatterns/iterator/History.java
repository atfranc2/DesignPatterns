package com.DesignPatterns.BehaviouralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class History<T> {
    private List<T> history = new ArrayList<>();
    private int index = 0;

    public void push(T item) {
        history.add(item);
        index++;
    }

    public T pop() {
        return history.remove(--index);
    }

    public Iterator<T> createIterator() {
        return new ListIterator<>(history);
    }

    // Technically the iterator is supposed to be nested inside the class!
}
