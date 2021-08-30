package com.DesignPatterns.BehaviouralPatterns.visitor;

public interface Operation {
    void apply(HeadingNode node);
    void apply(LinkNode node);
}
