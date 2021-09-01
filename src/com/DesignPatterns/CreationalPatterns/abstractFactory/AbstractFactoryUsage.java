package com.DesignPatterns.CreationalPatterns.abstractFactory;

import com.DesignPatterns.CreationalPatterns.abstractFactory.ant.AntFactory;
import com.DesignPatterns.CreationalPatterns.abstractFactory.app.ContactForm;
import com.DesignPatterns.CreationalPatterns.abstractFactory.material.MaterialFactory;

public class AbstractFactoryUsage {
    public static void Usage(){
        new ContactForm().render(new AntFactory());
        new ContactForm().render(new MaterialFactory());
    }
}
