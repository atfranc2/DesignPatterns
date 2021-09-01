package com.DesignPatterns.CreationalPatterns.abstractFactory.app;

import com.DesignPatterns.CreationalPatterns.abstractFactory.WidgetFactory;
import com.DesignPatterns.CreationalPatterns.abstractFactory.ant.AntButton;
import com.DesignPatterns.CreationalPatterns.abstractFactory.ant.AntTextBox;
import com.DesignPatterns.CreationalPatterns.abstractFactory.material.MaterialTextBox;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
