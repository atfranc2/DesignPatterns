package com.DesignPatterns.BehaviouralPatterns.visitor;

public class LinkNode implements HtmlNode {

    private String href;

    public LinkNode(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
