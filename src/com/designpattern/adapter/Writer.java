package com.designpattern.adapter;

public class Writer {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void write() {
        pen.write();
    }
}
