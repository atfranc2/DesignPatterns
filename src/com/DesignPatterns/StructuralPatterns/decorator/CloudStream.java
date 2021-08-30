package com.DesignPatterns.StructuralPatterns.decorator;

public class CloudStream implements Stream {
    public void write(String data) {
        System.out.println("Writing data to server with value " + data);
    }

}
