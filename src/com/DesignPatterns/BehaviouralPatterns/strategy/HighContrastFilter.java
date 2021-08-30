package com.DesignPatterns.BehaviouralPatterns.strategy;

public class HighContrastFilter implements Filter {
    @Override
    public void apply() {
        System.out.println("Applying high contrast filter...");
    }
}
