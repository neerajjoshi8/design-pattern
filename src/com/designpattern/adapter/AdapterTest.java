package com.designpattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        Writer writer = new Writer();
        PenAdapter penAdapter = new PenAdapter();
        writer.setPen(penAdapter);
        writer.write();
    }
}
