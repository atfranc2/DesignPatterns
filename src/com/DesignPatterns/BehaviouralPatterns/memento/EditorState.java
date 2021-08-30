package com.DesignPatterns.BehaviouralPatterns.memento;

public class EditorState {
    private final String content;
    private final String month;

    public EditorState(String name, String month) {
        this.content = name;
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public String getContent() {
        return content;
    }
}
