package org.example;

public class Floor {

    double width;
    double length;

    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    double getArea() {
        return width * length;
    }

}
