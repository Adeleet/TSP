package com.adaloudis;

import java.util.ArrayList;

public class NNAgent extends Agent {
    NNAgent(double startX, double startY, SalesArea salesArea) {
        super(startX, startY, salesArea);
    }
    public void moveToNearestDestination() {
        Position position = super.getPosition();
        ArrayList<Position> destinations = super.getDestinations();
            Position nearestDestination = super.getNearestDestination();
            super.setPosition(nearestDestination);
            destinations.remove(nearestDestination);
    }
}
