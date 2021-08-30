package com.DesignPatterns.BehaviouralPatterns.visitor;

public class UnderlineOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Underlining the heading node");
    }

    @Override
    public void apply(LinkNode node) {
        System.out.println("Underlining the link node");
    }
}
