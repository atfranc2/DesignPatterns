package com.DesignPatterns.BehaviouralPatterns.chainOfResponsibility;

public class Authenticator extends Handler<HttpRequest> {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var password = request.getPassword();
        var userName = request.getUserName();
        var isValid = (password == "1234" && userName == "Admin");

        System.out.println("Authenticated request");

        return !isValid;
    }
}
