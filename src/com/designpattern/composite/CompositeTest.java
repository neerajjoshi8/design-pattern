package com.designpattern.composite;

public class CompositeTest {

    public static void main(String[] args) {
        LeafComponent keyboard = new LeafComponent("keyboard", 800);
        LeafComponent mouse = new LeafComponent("mouse", 500);
        LeafComponent speaker = new LeafComponent("speaker", 1200);

        LeafComponent ram = new LeafComponent("ram", 2000);
        LeafComponent cpu = new LeafComponent("cpu", 5000);

        CompositeComponent peripheral = new CompositeComponent("peripheral");
        peripheral.getComponents().add(keyboard);
        peripheral.getComponents().add(mouse);
        peripheral.getComponents().add(speaker);

        CompositeComponent motherBoard = new CompositeComponent("motherboard");
        motherBoard.getComponents().add(ram);
        motherBoard.getComponents().add(cpu);

        CompositeComponent computer = new CompositeComponent("cpu");
        computer.getComponents().add(peripheral);
        computer.getComponents().add(motherBoard);

        computer.showPrice();

    }
}

