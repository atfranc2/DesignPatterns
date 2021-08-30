package com.DesignPatterns.StructuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    List<Component> components = new ArrayList<>();

    public void add(Component shape) {
        components.add(shape);
    }

    @Override
    public void render() {
        for(var component : components)
            component.render();
    }
}
