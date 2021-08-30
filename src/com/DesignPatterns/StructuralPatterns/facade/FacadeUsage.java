package com.DesignPatterns.StructuralPatterns.facade;

public class FacadeUsage {
    public static void Usage() {
        var server = new NotificationService();
        server.send("Hey babe", "your mom");
    }
}
