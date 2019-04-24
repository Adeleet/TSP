# TSP
#### Java Traveling Salesperson Problem Simulator

# Class Structure
## Agent
Abstract base class implementing methods to move around the area
##### Attributes
- `Position position`
- `SalesArea salesArea`
- `ArrayList<Position> destinations`
##### Methods
- `Position getPosition()`
- `ArrayList<Position> getDestinations()`
- `void setPosition(Position newPosition)`
- `Position getNearestDestination()`
## NNAgent
Example Agent subclass to implement the Nearest Neighbour algorithm
#### Methods
- `void moveToNearestDestination()`
## SalesArea
2D Area with Position's indication destinations and the Agent's position
##### Attributes
- `double height`
- `double width`
- `ArrayList<Position> destinations`
##### Methods
- `double getHeight()`
- `double getWidth()`
- `void addDestination(Position d)`
- `ArrayList<Position> getDestinations()`
- `int getNumberOfDestinations()`
- `void generateRandomDestinations(int n)`
## Position
Class indicating coordinates, to be used both for the Agent's position and possible destinations
##### Attributes
- `double height`
- `double width`
- `ArrayList<Position> destinations`
##### Methods
- `double x`
- `double y`
- `double getDistance(Position p)`
- `double getX()`
- `double getY()`
- `void setX(double X)`
- `void setY(double Y)`
