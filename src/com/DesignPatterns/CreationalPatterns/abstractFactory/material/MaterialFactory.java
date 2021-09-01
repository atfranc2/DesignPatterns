package com.DesignPatterns.CreationalPatterns.abstractFactory.material;

import com.DesignPatterns.CreationalPatterns.abstractFactory.Button;
import com.DesignPatterns.CreationalPatterns.abstractFactory.TextBox;
import com.DesignPatterns.CreationalPatterns.abstractFactory.WidgetFactory;

public class MaterialFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
