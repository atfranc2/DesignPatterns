package com.DesignPatterns.BehaviouralPatterns.command.Framework;

public interface UndoableCommand extends Command {
    void unexecute();
}
