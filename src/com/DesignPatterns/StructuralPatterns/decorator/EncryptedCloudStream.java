package com.DesignPatterns.StructuralPatterns.decorator;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }


    private String encrypt(String data) {
        System.out.println("Encrypting the cloud stream data");
        return "@>@>@" + data + "@>@>@";
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }
}
