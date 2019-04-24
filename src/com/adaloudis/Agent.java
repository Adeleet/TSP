package com.adaloudis;

import java.util.ArrayList;

abstract class Agent implements Strategy {
    private Position position;
    private SalesArea salesArea;
    private ArrayList<Position> destinations;
    Agent(double startX, double startY, SalesArea salesArea) {
        this.salesArea = salesArea;
        this.destinations = salesArea.getDestinations();
        this.position = new Position(startX, startY);
    }

    Position getPosition() {
        return this.position;
    }

    ArrayList<Position> getDestinations() {
        return this.salesArea.getDestinations();
    }

    void setPosition(Position newPosition) {
        this.position = newPosition;
    }


    Position getNearestDestination() {
        if (destinations.size() == 0) {
            return position;
        }

        Position nearestDestination = destinations.get(0);
        double nearestDistance = this.position.getDistance(nearestDestination);
        for (int i = 1; i < destinations.size(); i++) {
            Position newDestination = destinations.get(i);
            double newDistance = this.position.getDistance(newDestination);
            if (newDistance < nearestDistance) {
                nearestDestination = newDestination;
                nearestDistance = newDistance;
            }
        }
        return nearestDestination;
    }
}
