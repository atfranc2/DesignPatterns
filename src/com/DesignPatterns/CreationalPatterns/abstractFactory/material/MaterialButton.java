package com.DesignPatterns.CreationalPatterns.abstractFactory.material;

import com.DesignPatterns.CreationalPatterns.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Created material button");
    }
}
