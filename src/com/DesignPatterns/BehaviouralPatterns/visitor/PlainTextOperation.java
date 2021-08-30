package com.DesignPatterns.BehaviouralPatterns.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Converting the heading node to plain text with classes of " + node.getClassString());
    }

    @Override
    public void apply(LinkNode node) {
        System.out.println("Converting the link node to plain text with href = " + node.getHref());
    }
}
