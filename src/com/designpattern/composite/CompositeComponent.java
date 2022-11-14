package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component {
    private final String name;
    private final List<Component> components;

    public CompositeComponent(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component : components) {
            component.showPrice();
        }
    }
}
