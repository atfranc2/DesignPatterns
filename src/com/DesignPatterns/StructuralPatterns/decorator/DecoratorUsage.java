package com.DesignPatterns.StructuralPatterns.decorator;

public class DecoratorUsage {
    public static void Usage() {
        var cloud = new CloudStream();
        var compress = new CompressedCloudStream(cloud);
        var encrypt = new EncryptedCloudStream(compress);

        // Encrypt -> Compress -> Write to server
        encrypt.write("Hello world my name is andrew");
    }
}
