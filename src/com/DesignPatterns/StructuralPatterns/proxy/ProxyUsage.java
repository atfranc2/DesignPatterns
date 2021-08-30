package com.DesignPatterns.StructuralPatterns.proxy;

public class ProxyUsage {
    public static void Usage(){
        // Without proxy
        var library = new Library();
        String[] fileNames = { "Catcher in the Rye", "Fever", "Parasite" };
        for (var fileName : fileNames)
            library.add(new RealEbook(fileName));

        library.openEbook("Parasite");

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        // With Proxy: Only loads an ebook when a call is made to library.openEbook()
        // It caches the result so it still only loads it once
        var libraryWithProxy = new Library();
        for (var fileName : fileNames)
            libraryWithProxy.add(new RealEbookProxy(fileName));

        libraryWithProxy.openEbook("Parasite");
        System.out.println("\n");

        libraryWithProxy.openEbook("Parasite");
        System.out.println("\n");

        libraryWithProxy.openEbook("Fever");

    }
}
