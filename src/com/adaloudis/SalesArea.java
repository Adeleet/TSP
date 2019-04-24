package com.adaloudis;

import java.util.ArrayList;

public class SalesArea {
    private final double height;
    private final double width;

    private ArrayList<Position> destinations;
    private Position position;

    public SalesArea(double height, double width, Position initialPosition) {
        this.position = initialPosition;
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void addDestination(Position d) {
        destinations.add(d);
    }

    public ArrayList<Position> getDestinations() {
        return destinations;
    }

}