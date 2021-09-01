package com.DesignPatterns.CreationalPatterns.abstractFactory.ant;

import com.DesignPatterns.CreationalPatterns.abstractFactory.Button;
import com.DesignPatterns.CreationalPatterns.abstractFactory.TextBox;
import com.DesignPatterns.CreationalPatterns.abstractFactory.WidgetFactory;
import com.DesignPatterns.CreationalPatterns.abstractFactory.ant.AntButton;
import com.DesignPatterns.CreationalPatterns.abstractFactory.ant.AntTextBox;

public class AntFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
