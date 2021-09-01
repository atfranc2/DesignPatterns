package com.DesignPatterns.CreationalPatterns.factoryMethod.sharp;

import com.DesignPatterns.CreationalPatterns.factoryMethod.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Rendered the sharp " + viewName + "  view";
    }
}
