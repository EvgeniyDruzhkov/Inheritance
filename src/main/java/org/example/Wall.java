package org.example;

public class Wall {

    double width;
    double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = checkIfLessZero(width);
        this.height = checkIfLessZero(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = checkIfLessZero(width);

    }

    public void setHeight(double height) {
        this.height = checkIfLessZero(height);
    }

    private static double checkIfLessZero(double value) {
        return value < 0 ? 0 : value;
    }

    double getArea(){
        return width * height;
    }

}
