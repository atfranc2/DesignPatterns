package com.DesignPatterns.BehaviouralPatterns.observer;

public class ObserverUsage {
    public static void Usage() {
        // Observer with the pull communication style
        var source = new DataSource();
        var chart = new Chart(source);
        var spreadsheet = new Spreadsheet(source);

        source.addObserver(chart);
        source.addObserver(spreadsheet);

        source.setValue(10);
        source.setValue(101);
    }
}
