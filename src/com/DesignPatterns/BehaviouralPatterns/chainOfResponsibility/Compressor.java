package com.DesignPatterns.BehaviouralPatterns.chainOfResponsibility;

public class Compressor extends Handler<HttpRequest> {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressing the request");

        return false;
    }

}
