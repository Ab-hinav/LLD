package org.example;



import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {
    ElevatorCar elevatorCar;

    //Data structure to store the requests
    PriorityQueue<Request> minPQ = new PriorityQueue<Request>();
    PriorityQueue<Request> maxPQ = new PriorityQueue<Request>();
    Queue<Request> pendingRequests = new PriorityQueue<Request>();



    public void acceptRequest(int floorNumber, Direction direction) {

        Request request = new Request(floorNumber, direction);

        if (direction == Direction.UP && elevatorCar.getDirection() == Direction.UP && elevatorCar.getCurrentFloor() < floorNumber) {
            minPQ.add(request);
        } else if (direction == Direction.DOWN && elevatorCar.getDirection() == Direction.DOWN && elevatorCar.getCurrentFloor() > floorNumber) {
            maxPQ.add(request);
        } else {
            pendingRequests.add(request);
        }

    }

    public void controlElevator() {

        Direction currentDirection = elevatorCar.getDirection();
        int currentFloor = elevatorCar.getCurrentFloor();




    }


}
