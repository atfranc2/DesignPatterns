package com.DesignPatterns.CreationalPatterns.abstractFactory.ant;

import com.DesignPatterns.CreationalPatterns.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering ant text box");
    }
}
