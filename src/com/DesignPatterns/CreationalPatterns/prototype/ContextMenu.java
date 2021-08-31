package com.DesignPatterns.CreationalPatterns.prototype;

public class ContextMenu {
    public void duplicate(CloneableComponent component) {
        component.clone();
    }
}
