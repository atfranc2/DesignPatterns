package com.DesignPatterns.BehaviouralPatterns.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing JPEG Image");
    }
}
