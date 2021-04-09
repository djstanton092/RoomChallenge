package com.djstanton;

public class Dimensions {
    private double height;
    private double length;
    private double width;

    public Dimensions(double width, double length, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
