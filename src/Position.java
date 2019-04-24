import java.util.ArrayList;

class Position {
    private final double x;
    private final double y;

    public Position(float x, float y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Position p) {
        return Math.sqrt(Math.pow(p.x, 2) + Math.pow(p.y, 2));
    }

    Position getNearestDestination(ArrayList<Position> destinations) {
        Position nearestDestination = destinations.get(0);
        double nearestDistance = getDistance(nearestDestination);
        for (int i = 1; i < destinations.size(); i++) {
            Position newDestination = destinations.get(i);
            double newDistance = getDistance(newDestination);
            if (newDistance < nearestDistance) {
                nearestDestination = newDestination;
                nearestDistance = newDistance;
            }
        }
        return nearestDestination;
    }
}