package com.designpattern.builder;

public class ComputerBuilder {
    private String cpu;
    private String monitor;
    private String speaker;
    private String mouse;
    private String keyboard;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public ComputerBuilder setSpeaker(String speaker) {
        this.speaker = speaker;
        return this;
    }

    public ComputerBuilder setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public ComputerBuilder setKeyboard(String keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public Computer buildComputer() {
        return new Computer(cpu, monitor, speaker, mouse, keyboard);
    }

}
