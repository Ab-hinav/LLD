package org.example;

public class ElevatorCar {

    private long id;
    private Display display;
    private int currentFloor;
    private Direction direction;
    private Status status;
    private InternalButton[] internalButtons;
    private Door door;

    public boolean move(int destinationFloor, Direction direction) {
        // TODO implement here
        return false;
    }


    public Direction getDirection() {
        return direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
