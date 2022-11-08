package com.designpattern.adapter;

public class PenAdapter implements Pen {
    private BallPen ballPen = new BallPen();
    @Override
    public void write() {
        ballPen.write();
    }
}
