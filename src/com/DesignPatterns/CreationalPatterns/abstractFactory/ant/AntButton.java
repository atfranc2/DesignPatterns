package com.DesignPatterns.CreationalPatterns.abstractFactory.ant;

import com.DesignPatterns.CreationalPatterns.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Created ant button");
    }
}
