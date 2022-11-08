package com.designpattern.composite;

public class LeafComponent implements Component {
    private final String name;
    private final double price;

    public LeafComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " :: " + price);
    }
}
