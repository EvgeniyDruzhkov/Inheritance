package org.example;

public class Carpet {

    double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    double getCost() {
        return cost;
    }
}
