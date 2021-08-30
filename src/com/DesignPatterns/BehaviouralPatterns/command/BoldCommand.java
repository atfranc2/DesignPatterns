package com.DesignPatterns.BehaviouralPatterns.command;

import com.DesignPatterns.BehaviouralPatterns.command.Framework.History;
import com.DesignPatterns.BehaviouralPatterns.command.Framework.UndoableCommand;

public class BoldCommand implements UndoableCommand {
    private Document document;
    private History history;
    private String prevContent;

    public BoldCommand(Document document, History<UndoableCommand> history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
