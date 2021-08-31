package com.DesignPatterns.CreationalPatterns.singleton;

public class SingletonUsage {
    public static void Usage() {
        var firstInstance = ConfigManager.getInstance();
        firstInstance.set("name", "andrew");
        System.out.println(firstInstance.get("name"));

        // Create second reference but it points to the same instance of
        // config manager because there is only ever one instance
        var secondInstance = ConfigManager.getInstance();
        System.out.println(secondInstance.get("name"));

    }
}
