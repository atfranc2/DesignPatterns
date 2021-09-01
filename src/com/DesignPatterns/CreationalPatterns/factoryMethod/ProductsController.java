package com.DesignPatterns.CreationalPatterns.factoryMethod;

import com.DesignPatterns.CreationalPatterns.factoryMethod.matcha.Controller;
import com.DesignPatterns.CreationalPatterns.factoryMethod.matcha.ViewEngine;
import com.DesignPatterns.CreationalPatterns.factoryMethod.sharp.SharpController;
import com.DesignPatterns.CreationalPatterns.factoryMethod.sharp.SharpViewEngine;

import java.util.HashMap;

public class ProductsController extends SharpController {

    public void listProducts(){
        render("products", new HashMap<>());
    }
}
