package com.DesignPatterns.BehaviouralPatterns.strategy;

public class StrategyUsage {
    public static void Usage(){
        Compressor jpeg = new PngCompressor();
        Filter highContrast = new HighContrastFilter();
        ImageStorage storage = new ImageStorage(highContrast, jpeg);
        storage.store("NewImage");
    }
}
