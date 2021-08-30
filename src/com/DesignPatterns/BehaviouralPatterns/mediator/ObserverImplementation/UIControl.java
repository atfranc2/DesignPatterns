package com.DesignPatterns.BehaviouralPatterns.mediator.ObserverImplementation;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> observers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        observers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (var observer: observers) {
            observer.handle();
        }
    }
}
