package com.DesignPatterns.CreationalPatterns.factoryMethod;

import java.util.HashMap;

public class FactoryMethodUsage {
    public static void Usage() {
        // Default implementation
        var defaultViewEngine = new MoneyController();
        defaultViewEngine.listMoney();

        // Custom sharp renderer
        var sharpViewEngine = new ProductsController();
        sharpViewEngine.render("sharp.view", new HashMap<>());

    }
}
