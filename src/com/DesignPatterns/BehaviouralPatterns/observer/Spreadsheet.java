package com.DesignPatterns.BehaviouralPatterns.observer;

public class Spreadsheet implements Observer {
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Updating spreadsheet: " + dataSource.getValue());
    }
}
