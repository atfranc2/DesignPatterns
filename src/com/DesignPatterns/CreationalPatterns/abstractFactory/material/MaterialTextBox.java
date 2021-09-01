package com.DesignPatterns.CreationalPatterns.abstractFactory.material;

import com.DesignPatterns.CreationalPatterns.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering material text box");
    }
}
