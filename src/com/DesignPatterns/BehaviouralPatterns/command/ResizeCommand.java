package com.DesignPatterns.BehaviouralPatterns.command;

import com.DesignPatterns.BehaviouralPatterns.command.Framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing frame");
    }
}
