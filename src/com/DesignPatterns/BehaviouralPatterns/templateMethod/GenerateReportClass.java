package com.DesignPatterns.BehaviouralPatterns.templateMethod;

public class GenerateReportClass extends Task {

    public GenerateReportClass(AuditTrail auditTrail){
        super(auditTrail);
    }

    @Override
    public void doExecute() {
        System.out.println("Generating report");
    }
}
