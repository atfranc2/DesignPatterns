package com.DesignPatterns.BehaviouralPatterns.observer;

public class Chart implements Observer {

    private DataSource dataSource;
    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Updating Chart: " + dataSource.getValue());
    }
}
