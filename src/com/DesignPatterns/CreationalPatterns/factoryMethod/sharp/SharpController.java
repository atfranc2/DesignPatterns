package com.DesignPatterns.CreationalPatterns.factoryMethod.sharp;

import com.DesignPatterns.CreationalPatterns.factoryMethod.matcha.Controller;
import com.DesignPatterns.CreationalPatterns.factoryMethod.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine(){
        return new SharpViewEngine();
    }
}
