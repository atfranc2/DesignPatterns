package com.DesignPatterns.BehaviouralPatterns.memento;

public class MementoUsage {
    public static void Usage(){
        var editor = new Editor();
        var history = new History<EditorState>();

        // Set content and push the state onto the history stack
        editor.setContent("Content1");
        history.push(editor.createState());

        editor.setMonth("January");
        history.push(editor.createState());

        editor.setContent("Content2");

        editor.restoreState(history.pop());
        editor.printState();

        // Remove the last state and set the current state to the previous state
        editor.restoreState(history.pop());
        editor.printState();
    }
}
