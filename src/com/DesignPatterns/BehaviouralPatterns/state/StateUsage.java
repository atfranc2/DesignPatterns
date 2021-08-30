package com.DesignPatterns.BehaviouralPatterns.state;

public class StateUsage {
    public static void Usage() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new Selection());
        canvas.mouseUp();
        canvas.setCurrentTool(new Brush());
        canvas.mouseUp();
    }
}
