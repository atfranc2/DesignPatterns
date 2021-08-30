package com.DesignPatterns.BehaviouralPatterns.iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return (currentIndex != array.length - 1) && array[currentIndex] != null;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public T current() {
        return array[currentIndex];
    }
}
