package com.DesignPatterns.BehaviouralPatterns.command.Framework;

import java.util.ArrayList;
import java.util.List;

public class History<E> {
    private List<E> history = new ArrayList<>();

    public void push(E item) {
        history.add(item);
    }

    public E pop() {
        return history.remove(history.size() - 1);
    }
}
