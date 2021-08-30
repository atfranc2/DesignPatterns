package com.DesignPatterns.BehaviouralPatterns.templateMethod;

public class TemplateMethodUsage {
    public void Usage() {
        var at = new AuditTrail();
        var tmt = new TransferMoneyTask(at);
        var grc = new GenerateReportClass(at);
        tmt.execute();
        grc.execute();
    }
}
