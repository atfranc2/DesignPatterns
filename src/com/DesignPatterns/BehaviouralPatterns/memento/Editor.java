package com.DesignPatterns.BehaviouralPatterns.memento;

public class Editor {
    private String content;
    private String month;

    public Editor() {
    }

    public EditorState createState() {
        return new EditorState(content, month);
    }

    public void restoreState(EditorState state) {
        content = state.getContent();
        month = state.getMonth();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void printState(){
        System.out.println("{ content: " + content + ", month: " + month + " }");
    }
}
