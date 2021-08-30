package com.DesignPatterns.BehaviouralPatterns.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply() {
        System.out.println("Applying black and white filter");
    }
}
