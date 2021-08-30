package com.DesignPatterns.BehaviouralPatterns.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {

    private List<T> list;
    private int index;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index != list.size();
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public T current() {
        return list.get(index);
    }
}
