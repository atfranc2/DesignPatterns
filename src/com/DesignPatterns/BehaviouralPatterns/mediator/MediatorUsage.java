package com.DesignPatterns.BehaviouralPatterns.mediator;

import com.DesignPatterns.BehaviouralPatterns.mediator.ObserverImplementation.ArticleDialogBoxObs;

public class MediatorUsage {
    public static void Usage() {
        // Vanilla
        var dialogBox = new ArticleDialogBox();
        dialogBox.simulateUserInteraction();

        // Implemented using the observer pattern
        var observerDialogBox = new ArticleDialogBoxObs();
        observerDialogBox.simulateUserInteraction();
    }
}
