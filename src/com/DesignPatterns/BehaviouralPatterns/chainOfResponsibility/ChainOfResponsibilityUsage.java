package com.DesignPatterns.BehaviouralPatterns.chainOfResponsibility;

public class ChainOfResponsibilityUsage {
    public static void Usage() {
        var request = new HttpRequest("Admin", "1234", "Hello");
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(request);
    }
}
