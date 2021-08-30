package com.DesignPatterns.BehaviouralPatterns.visitor;

public class HeadingNode implements HtmlNode {

    private String classString;

    public HeadingNode(String classString) {
        this.classString = classString;
    }

    public String getClassString() {
        return classString;
    }

    public void setClassString(String classString) {
        this.classString = classString;
    }

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
