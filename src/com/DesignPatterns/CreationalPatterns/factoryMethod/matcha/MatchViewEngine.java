package com.DesignPatterns.CreationalPatterns.factoryMethod.matcha;

import java.util.Map;

public class MatchViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "Rendered the matcha " + viewName + " view";
    }
}
