package com.DesignPatterns.BehaviouralPatterns.state;

public class Canvas {
    private Tool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void setCurrentTool(Tool tool) {
        currentTool = tool;
    }
}
