package com.DesignPatterns.StructuralPatterns.decorator;

public class CompressedCloudStream implements Stream {

    Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    private String compress(String data) {
        System.out.println("Compressing cloud data");
        return data.substring(0,6);
    }

    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }
}
