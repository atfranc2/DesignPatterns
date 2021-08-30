package com.DesignPatterns.BehaviouralPatterns.templateMethod;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public final void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
