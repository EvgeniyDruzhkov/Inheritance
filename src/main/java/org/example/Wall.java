package org.example;

public class Wall {

    double width;
    double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = checkIfLessThanZero(width);
        this.height = checkIfLessThanZero(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = checkIfLessThanZero(width);

    }

    public void setHeight(double height) {
        this.height = checkIfLessThanZero(height);
    }

    private static double checkIfLessThanZero(double value) {
        return value < 0 ? 0 : value;
    }

    double getArea(){
        return width * height;
    }

}
