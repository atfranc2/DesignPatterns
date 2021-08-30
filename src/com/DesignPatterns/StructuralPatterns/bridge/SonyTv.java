package com.DesignPatterns.StructuralPatterns.bridge;

public class SonyTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony: set to channel " + channel);
    }
}
