package com.DesignPatterns.BehaviouralPatterns.chainOfResponsibility;

public abstract class Handler<T> {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(T request) {
        if(doHandle(request))
            return;

        if (next != null)
            next.handle(request);
    }

    protected abstract boolean doHandle(T request);
}
