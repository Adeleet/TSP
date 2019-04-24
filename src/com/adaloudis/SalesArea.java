package com.adaloudis;

import java.util.ArrayList;

public class SalesArea {
    private final double height;
    private final double width;

    private ArrayList<Position> destinations;

    SalesArea(double height, double width) {
        this.destinations = new ArrayList<>();
        this.height = height;
        this.width = width;
    }



    double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void addDestination(Position d) {
        destinations.add(d);
    }

    ArrayList<Position> getDestinations() {
        return destinations;
    }



    public int getNumberOfDestinations() {
        return destinations.size();
    }
    
    void generateRandomDestinations(int n) {
        ArrayList<Position> randomPositions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = (int)(Math.random()*((this.width)+1));
            int y = (int)(Math.random()*((this.height)+1));
            Position randPosition = new Position(x,y);
            this.destinations.add(randPosition);
        }
    }




}