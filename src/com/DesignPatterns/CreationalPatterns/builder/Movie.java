package com.DesignPatterns.CreationalPatterns.builder;

public class Movie {
    public void addFrame(String text, int duration) {
        System.out.println("Adding frame to movie with text:" + text + ", and duration: " + duration);
    }
}
