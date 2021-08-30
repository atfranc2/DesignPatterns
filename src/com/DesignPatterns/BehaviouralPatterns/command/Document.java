package com.DesignPatterns.BehaviouralPatterns.command;

public class Document {

    private String content;
    private int count = 0;

    public Document(String content) {
        this.content = content;
    }

    public void makeBold(){
        content = content + count++;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
