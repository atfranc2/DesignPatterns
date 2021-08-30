package com.DesignPatterns.BehaviouralPatterns.command.Framework;

public class Button {

    private Command command;
    private String label;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
