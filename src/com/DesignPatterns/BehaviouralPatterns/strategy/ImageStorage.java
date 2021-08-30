package com.DesignPatterns.BehaviouralPatterns.strategy;

public class ImageStorage {
    private Filter filter;
    private Compressor compressor;

    public ImageStorage(Filter filter, Compressor compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }

    public void store(String fileName) {
        compressor.compress();
        filter.apply();

        System.out.println("Storing image...");
    }
}
