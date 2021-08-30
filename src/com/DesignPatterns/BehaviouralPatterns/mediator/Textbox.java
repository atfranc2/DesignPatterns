package com.DesignPatterns.BehaviouralPatterns.mediator;

public class Textbox extends UIControl {
    private String content;

    public Textbox(DialogBox owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}
