package org.example;

public class Cuboid extends Rectangle {

    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    double getVolume() {
        return getArea() * height;
    }
}
