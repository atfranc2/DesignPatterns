package com.DesignPatterns.StructuralPatterns.bridge;

public class BridgeUsage {
    public static void Usage(){
        var samsungTv = new SamsungTv();
        var sonyTv = new SonyTv();

        var samsungRemote = new RemoteControl(samsungTv);
        samsungRemote.turnOn();

        var advancedSonyRemote = new AdvancedRemoteControl(sonyTv);
        advancedSonyRemote.setChannel(32);
    }
}
