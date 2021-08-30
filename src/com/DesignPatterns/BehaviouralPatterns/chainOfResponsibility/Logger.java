package com.DesignPatterns.BehaviouralPatterns.chainOfResponsibility;

public class Logger extends Handler<HttpRequest> {

    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("logging the request");

        return false;
    }

}

