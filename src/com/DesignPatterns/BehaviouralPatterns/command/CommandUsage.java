package com.DesignPatterns.BehaviouralPatterns.command;

import com.DesignPatterns.BehaviouralPatterns.command.Framework.Button;
import com.DesignPatterns.BehaviouralPatterns.command.Framework.History;
import com.DesignPatterns.BehaviouralPatterns.command.Framework.UndoableCommand;

public class CommandUsage {
    public void Usage(){
        // Regular command pattern
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();



        // Undoable Command Pattern
        var document = new Document("Orig");
        var history = new History<UndoableCommand>();
        var undoCommand = new UndoCommand(history);
        var bold = new BoldCommand(document, history);

        bold.execute();
        System.out.println(document.getContent());

        bold.execute();
        System.out.println(document.getContent());

        undoCommand.execute();

        bold.execute();
        System.out.println(document.getContent());
    }
}
