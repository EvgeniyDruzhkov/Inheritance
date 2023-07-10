package org.example;

public class Calculator {

    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
