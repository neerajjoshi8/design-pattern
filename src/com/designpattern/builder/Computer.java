package com.designpattern.builder;

public class Computer {
    private String cpu;
    private String monitor;
    private String speaker;
    private String mouse;
    private String keyboard;

    public Computer() {
    }

    public Computer(String cpu, String monitor, String speaker, String mouse, String keyboard) {
        super();
        this.cpu = cpu;
        this.monitor = monitor;
        this.speaker = speaker;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", monitor=" + monitor + ", speaker=" + speaker + ", mouse=" + mouse
                + ", keyboard=" + keyboard + "]";
    }

}
