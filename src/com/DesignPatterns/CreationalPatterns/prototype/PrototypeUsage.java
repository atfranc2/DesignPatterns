package com.DesignPatterns.CreationalPatterns.prototype;

public class PrototypeUsage {
    public static void Usage() {
        var circle = new Circle();
        circle.setRadius(3);

        var cm = new ContextMenu();
        cm.duplicate(circle);
    }
}
