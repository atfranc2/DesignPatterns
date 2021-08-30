package com.DesignPatterns.StructuralPatterns.proxy;

public class LoggingEbookProxy implements Ebook {

    private RealEbook ebook;
    private String fileName;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        System.out.println("Logging the request for ebook retrieval");
        if(ebook == null)
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
