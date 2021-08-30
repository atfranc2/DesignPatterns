package com.DesignPatterns.BehaviouralPatterns.mediator.ObserverImplementation;

public class Textbox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
