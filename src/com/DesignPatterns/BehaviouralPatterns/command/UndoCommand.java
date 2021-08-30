package com.DesignPatterns.BehaviouralPatterns.command;

import com.DesignPatterns.BehaviouralPatterns.command.Framework.Command;
import com.DesignPatterns.BehaviouralPatterns.command.Framework.History;
import com.DesignPatterns.BehaviouralPatterns.command.Framework.UndoableCommand;

public class UndoCommand implements Command {
    private History<UndoableCommand> history;

    public UndoCommand(History<UndoableCommand> history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.pop().unexecute();
    }
}
