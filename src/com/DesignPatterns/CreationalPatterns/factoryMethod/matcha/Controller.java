package com.DesignPatterns.CreationalPatterns.factoryMethod.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var viewEngine = createViewEngine();
        var html = viewEngine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine(){
        return new MatchViewEngine();
    }

}
