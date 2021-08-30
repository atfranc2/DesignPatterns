package com.DesignPatterns.BehaviouralPatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    void next();
    T current();
}
