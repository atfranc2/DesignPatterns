package com.DesignPatterns.CreationalPatterns.factoryMethod;

import com.DesignPatterns.CreationalPatterns.factoryMethod.matcha.Controller;

import java.util.HashMap;

public class MoneyController extends Controller {
    public void listMoney(){
        render("matcha.view", new HashMap<>());
    }
}
