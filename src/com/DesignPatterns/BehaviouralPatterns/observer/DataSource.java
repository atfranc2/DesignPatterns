package com.DesignPatterns.BehaviouralPatterns.observer;

public class DataSource extends Subject {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
