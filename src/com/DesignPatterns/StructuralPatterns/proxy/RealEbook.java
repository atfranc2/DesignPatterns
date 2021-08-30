package com.DesignPatterns.StructuralPatterns.proxy;

public class RealEbook implements Ebook {

    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public void show() {
        System.out.println("Showing the real ebook: " + fileName);
    }

    private void load() {
        System.out.println("Loading ebook: " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
