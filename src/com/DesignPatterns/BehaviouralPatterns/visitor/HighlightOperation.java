package com.DesignPatterns.BehaviouralPatterns.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Highlighting the heading node with classes of " + node.getClassString());
    }

    @Override
    public void apply(LinkNode node) {
        System.out.println("Highlighting the link node with href = " + node.getHref());
    }
}
