package com.DesignPatterns.StructuralPatterns.proxy;

public class RealEbookProxy implements Ebook {

    private RealEbook ebook;
    private String fileName;

    public RealEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        System.out.println("Forwarding load request to the real Ebook");
        if(ebook == null)
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
