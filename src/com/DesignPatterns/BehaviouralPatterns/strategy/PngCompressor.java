package com.DesignPatterns.BehaviouralPatterns.strategy;

public class PngCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing PNG image...");
    }
}
